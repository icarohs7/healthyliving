/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhopac.healthyliving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author carlos
 */
public class ArquivoUsuario {

    File arquivo = new File(System.getProperty("user.dir") + "/userdata.dat");

    public void Escrever(String texto) {

	try {

	    if (!arquivo.exists()) {
		arquivo.createNewFile();
	    }

	    FileWriter fw = new FileWriter(arquivo);
	    //BufferedWriter bw = new BufferedWriter(fw);

	    fw.write(texto);

	    //bw.close();
	    fw.close();

	} catch (IOException e) {
	}

    }

    public String Ler() {

	String texto = null;

	try {

	    FileReader fr = new FileReader(arquivo);
	    BufferedReader br = new BufferedReader(fr);

	    texto = br.readLine();

	    br.close();
	    fr.close();

	} catch (Exception e) {
	}

	return texto;

    }

    public boolean CheckUser() {

	boolean result = false;
	String texto;

	try {

	    FileReader fr = new FileReader(arquivo);
	    BufferedReader br = new BufferedReader(fr);

	    texto = br.readLine();

	    //Verifica se o texto do arquivo não é igual a null
	    if (!texto.equals("null")) {
		result = true;
	    }

	    br.close();
	    fr.close();

	} catch (Exception e) {
	}

	return result;

    }

    public void LogoutUser() {

	try {

	    if (!arquivo.exists()) {
		arquivo.createNewFile();
	    }

	    FileWriter fw = new FileWriter(arquivo);
	    //BufferedWriter bw = new BufferedWriter(fw);

	    fw.write("null");

	    //bw.close();
	    fw.close();

	} catch (IOException e) {
	}

    }

}
