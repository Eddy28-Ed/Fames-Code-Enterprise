/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author User
 */
public class AutoMovil {
    
    // Atributos privados (ENCAPSULACIÓN)
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    // Constructor
    public AutoMovil() {
        System.out.println("Constructor de AutoMovil");
    }

    // GETTERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // MÉTODOS
    public void encender() {
        System.out.println("El automovil esta encendiendo...");
    }

    public void apagar() {
        System.out.println("El automovil se esta apagando...");
    }

    public void acelerar() {
        System.out.println("El automovil esta acelerando...");
    }

    public void frenar() {
        System.out.println("El automovil esta frenando...");
    }
}
