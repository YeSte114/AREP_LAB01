/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.escuelaing.arep;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author jeison.barreto
 */
public class Networking {

    public static void main(String[] args) throws MalformedURLException {
        URL personalSite = new URL("http://ldbn.escuelaing.edu.co:80/");
        System.out.println("Protocol: " + personalSite.getProtocol());
        System.out.println("Authority: " + personalSite.getAuthority());
        System.out.println("Host: " + personalSite.getHost());
        System.out.println("Port: " + personalSite.getPort());
        System.out.println("Path: " + personalSite.getPath());
        System.out.println("Query: " + personalSite.getQuery());
        System.out.println("File: " + personalSite.getFile());
        System.out.println("Ref: " + personalSite.getRef());
    }
}
