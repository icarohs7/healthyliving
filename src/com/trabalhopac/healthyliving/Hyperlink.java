/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhopac.healthyliving;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author carlos
 */
public class Hyperlink {

    public void browse(String url) {

        Desktop desktop = Desktop.getDesktop();

        try {

            URI uri = new URI(url);
            desktop.browse(uri);

        } catch (IOException | URISyntaxException e) {
            
        }

    }

}
