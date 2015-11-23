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

/**
 *
 * @author Carlos, Suellen, Vitor e Ícaro
 */
public class ConexaoHTTP {

    public int totalDeCalorias;

    public StringBuilder httpBuffer(String site, String parametros) {

        StringBuilder resposta = new StringBuilder();
        BufferedReader buffer;
        String linha;

        try {

            URL url = new URL(site);

            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            try (OutputStreamWriter escrever = new OutputStreamWriter(conn.getOutputStream())) {

                escrever.write(parametros);
                escrever.flush();
                buffer = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                while ((linha = buffer.readLine()) != null) {

                    resposta.append(linha);

                }

            }

            buffer.close();

        } catch (IOException ex) {
            Logger.getLogger(ConexaoHTTP.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resposta;

    }

    public JSONObject httpJson(String site, String parametros) {

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

    public JSONObject login(String usuario, String senha) {

        String parametros = "usuario=" + usuario + "&senha=" + senha;
        String url = "http://healthyliving.aduv.com.br/admin/login.php";

        JSONObject resposta = httpJson(url, parametros);

        return resposta;

    }

    public void alimentos(String alimento, int caloria) {

        String parametros = "alimento=" + alimento + "&caloria=" + caloria + "&json=true";
        String url = "http://healthyliving.aduv.com.br/admin/alimentos/controle_calorias.php";

        JSONObject resposta = httpJson(url, parametros);

        try {

            this.totalDeCalorias = resposta.getInt("Calorias"); //Atribui o valor de caloria do alimento

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

        String url = "http://healthyliving.aduv.com.br/connect/dica.php";
        StringBuilder resposta;

        resposta = httpBuffer(url, "");

        return resposta.toString();

    }

}
