package com.trabalhopac.healthyliving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

//@author carlos
public class ConexaoHTTP {

    public String nome;
    public boolean login;

    public JSONObject http(String site, String parametros) {

	JSONObject resposta = null;

	try {

	    BufferedReader reader;

	    URL url = new URL(site);

	    URLConnection conn = url.openConnection();
	    conn.setDoOutput(true);

	    try (OutputStreamWriter escrever = new OutputStreamWriter(conn.getOutputStream())) {

		escrever.write(parametros);
		escrever.flush();
		reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		//Recebe a resposta do servidor e guarda num JSONObject
		resposta = new JSONObject(reader.readLine());

	    }

	    reader.close();

	} catch (IOException | JSONException ex) {
	    Logger.getLogger(ConexaoHTTP.class.getName()).log(Level.SEVERE, null, ex);
	}

	return resposta;

    }

    public void login(String usuario, String senha) {

	String parametros = "usuario=" + usuario + "&senha=" + senha;
	String url = "http://healthyliving.aduv.com.br/admin/login.php";

	JSONObject resposta = http(url, parametros);

	try {

	    nome = resposta.getString("Nome"); //Atribui o nome do usuário recebido
	    login = resposta.getBoolean("Login"); //Retorna true se o usuário e senha forem válidos

	} catch (JSONException ex) {
	    Logger.getLogger(ConexaoHTTP.class.getName()).log(Level.SEVERE, null, ex);
	}

    }

    /**
     * Faz a conexão HTTP e pega a dica do dia
     *
     * @return Ele retorna a String da dica do dia
     */
    public String dicaDoDia() {

//	String parametros = "variavel=valor";
	String url = "http://healthyliving.aduv.com.br/connect/dica.php";
	String dica = null;

	JSONObject resposta;
	try {

	    resposta = http(url, "");
	    dica = resposta.getString("Dica");

	} catch (JSONException ex) {
	    Logger.getLogger(ConexaoHTTP.class.getName()).log(Level.SEVERE, null, ex);
	}

	return dica;

    }

}
