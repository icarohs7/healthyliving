package com.trabalhopac.healthyliving;

/**
 *
 * @author Carlos, Suellen, Vitor e Ícaro
 */
public class Main {

    public static void main(String[] args) {
	
	ArquivoUsuario arquivo = new ArquivoUsuario();

        //Look and feel do programa
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	try {
	    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
        //</editor-fold>

	if (arquivo.CheckUser()) {
	    new MainForm().setVisible(true);
	} else {
	    new LoginForm().setVisible(true);
	}
	
    }

}
