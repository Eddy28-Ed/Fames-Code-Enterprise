/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovil;

/**
 *
 * @author DAWRY13
 */
public class AutoMovil {

     //Atributos privados(Encapsulación)
    private String marca;
    private String modelo;
    private int año;
    private String color;
    
      // Constructor
    public AutoMovil(){
        System.out.println("Constructor de automovil");
    }
    
    // Getters y Setters
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setAño(int año){
        this.año = año;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    // Métodos
    public void encender(){
        System.out.println("El automovil esta encendido...");
    }
    
    public void apagar(){
        System.out.println("El automovil esta apagando...");
    }
    public void acelerar(){
        System.out.println("El automovil esta acelerando...");
    }
    public void frenar(){
        System.out.println("El automovil esta frenando...");
    }
}
