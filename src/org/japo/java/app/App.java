/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import org.japo.java.entities.Mandocleta;

/**
 *
 * @author Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es
 */
public final class App {

    public void launchapp() {
        System.out.println("MANDOCLETA 1");
        System.out.println("============");
        Mandocleta m1 = new Mandocleta();
        System.out.println(m1);
        System.out.println("Actualizando");
        m1.setVelocidad(0.8);
        System.out.println(m1);
        
        System.out.println("---");       
        
        System.out.println("Mandocleta 2");
        System.out.println("============");
        Mandocleta m2 = new Mandocleta();
        System.out.println(m2);
        
        m2.setVelocidad(1.2);
        System.out.println(m2);
        
        System.out.println("---");
        
        System.out.println("Mandocleta 1 vs Mandocleta 2");       
        System.out.println("============================");
        System.out.printf("Comparacion .....: %s%n",m2.equals(m1) ? "IGUALES" : "DIFERENTES");
        
    }
}
