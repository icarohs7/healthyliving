package com.trabalhopac.healthyliving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author carlos
 */
public class ConexaoHTTP {

    public String nome;
    public boolean login;
    
    public void login(String usuario, String senha) throws MalformedURLException, IOException, JSONException {

	String urlParameters = "usuario=" + usuario + "&senha=" + senha;
	URL url = new URL("http://healthyliving.pe.hu/admin/login.php");
	URLConnection conn = url.openConnection();

	conn.setDoOutput(true);

	OutputStreamWriter escrever = new OutputStreamWriter(conn.getOutputStream());

	escrever.write(urlParameters);
	escrever.flush();

	BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

	//|-----------------------------------------|
	//|----- Código para mais de uma linha -----|
	//|-----------------------------------------|
	//
	//while ((resposta = reader.readLine()) != null) {
	//    System.out.println(resposta);
	//}
	
	//Recebe a resposta do servidor e guarda num JSONObject
	JSONObject resposta = new JSONObject(reader.readLine());
	
        nome = resposta.getString("Nome"); //Atribui o nome do usuário recebido
	login = resposta.getBoolean("Login"); //Retorna true se o usuário e senha forem válidos

	escrever.close();
	reader.close();

    }

}