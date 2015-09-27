package com.trabalhopac.healthyliving;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class ConexaoMySQL {
    
    //Variaveis de conexao
    Connection	con;
    Statement	stmt;
    ResultSet	res;
    
    //Argumentos do driver de conexao
    String url	    = "jdbc:mysql://";
    String user	    = "";
    String pass	    = "";
    String driver   = "com.mysql.jdbc.Driver";
    
    public void conexao() {
	
	try {
	
	    Class.forName(driver).newInstance();
	    con = DriverManager.getConnection(url, user, pass);

	    //Cria uma variavel de Statement
	    stmt = con.createStatement();
	    
	} catch (Exception e) { //Captura erro na conexao com o banco
	
	    JOptionPane.showMessageDialog(null,
		    "Erro na conexão com o banco de dados!", "ERRO",
		    JOptionPane.ERROR_MESSAGE);
	
	}
	
    }	   
    
}
