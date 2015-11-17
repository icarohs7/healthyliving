package com.trabalhopac.healthyliving;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos, Suellen, Vitor e Ícaro
 */
public class ArquivoUsuario {

    File arquivo = new File(System.getProperty("user.dir") + "/userdata.dat");

    public void Escrever(String texto) {

	try {

	    if (!arquivo.exists()) {
		arquivo.createNewFile();
	    }

	    try (FileWriter fw = new FileWriter(arquivo)) {
		fw.write(texto);
	    }

	} catch (IOException e) {
	    Logger.getLogger(ArquivoUsuario.class.getName()).log(Level.SEVERE, null, e);
	}

    }

    public String Ler() {

	String texto = null;

	try {

	    try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)) {
		texto = br.readLine();
	    }

	} catch (Exception e) {
	    Logger.getLogger(ArquivoUsuario.class.getName()).log(Level.SEVERE, null, e);
	}

	return texto;

    }

    public boolean CheckUser() {

	boolean result = false;
	String texto;

	try {

	    try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)) {

		texto = br.readLine();

		//Verifica se o texto do arquivo não é igual a null
		if (!texto.equals("null")) {
		    result = true;
		}

	    }

	} catch (Exception e) {
	    Logger.getLogger(ArquivoUsuario.class.getName()).log(Level.SEVERE, null, e);
	}

	return result;

    }

    public void LogoutUser() {

	try {

	    if (!arquivo.exists()) {
		arquivo.createNewFile();
	    }

	    try (FileWriter fw = new FileWriter(arquivo)) {
		fw.write("null");
	    }

	} catch (IOException e) {
	    Logger.getLogger(ArquivoUsuario.class.getName()).log(Level.SEVERE, null, e);
	}

    }

}
