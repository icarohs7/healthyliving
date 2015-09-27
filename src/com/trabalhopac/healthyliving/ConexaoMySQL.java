package com.trabalhopac.healthyliving;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class ConexaoMySQL {

    //Variaveis de login
    Connection con;
    Statement stmt;
    ResultSet res;

    //Argumentos do driver de login
    private final String url = "jdbc:mysql://db4free.net/trabalhopac";
    private final String user = "healthyliving";
    private final String pass = "156999";
    private final String driver = "com.mysql.jdbc.Driver";

    public void login(String login, String senha) {

	try {

	    Class.forName(driver).newInstance();
	    con = DriverManager.getConnection(url, user, pass);

	    //Cria uma variavel de Statement
	    stmt = con.createStatement();

	    //Comando MySQL
	    String SQL = "SELECT * FROM `Users` WHERE `User` = '" + login + "' && `Pass` = '" + senha + "'";

	    System.out.println(SQL);

	    //Executa o comando MySQL
	    res = stmt.executeQuery(SQL);
	    res.first();

	} catch (Exception e) { //Captura erro na login com o banco

	    JOptionPane.showMessageDialog(null,
		    "Erro na conexão com o banco de dados!", "ERRO",
		    JOptionPane.ERROR_MESSAGE);

	}

    }

}
