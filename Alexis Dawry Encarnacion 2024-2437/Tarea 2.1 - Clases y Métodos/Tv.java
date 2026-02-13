/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tv;

/**
 *
 * @author DAWRY13
 */
public class Tv {

    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;
    
    public void encender() {
    
        System.out.println("La TV se esta encendiendo...");
        encendido = true;
    }
    
     public void apagar() {
    
        System.out.println("La TV se esta apagando...");
        encendido = false;
    }
    
     
      public void subirvolumen() {
    
        System.out.println("Subiendo volumen...");
        encendido = true;
    }
    
     
     public void bajarvolumen() {
    
        System.out.println("Bajando volumen...");
        volumen++;
    }
    
    
}
