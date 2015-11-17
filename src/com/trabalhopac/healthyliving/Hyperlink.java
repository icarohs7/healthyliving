package com.trabalhopac.healthyliving;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos, Suellen, Vitor e Ícaro
 */
public class Hyperlink {

    public void browse(String url) {

	Desktop desktop = Desktop.getDesktop();

	try {

	    URI uri = new URI(url);
	    desktop.browse(uri);

	} catch (IOException | URISyntaxException ex) {
	    Logger.getLogger(Hyperlink.class.getName()).log(Level.INFO, null, ex);
	}

    }

}
