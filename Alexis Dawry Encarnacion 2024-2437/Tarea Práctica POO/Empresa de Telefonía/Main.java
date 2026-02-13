/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresadetelefonia;

/**
 *
 * @author DAWRY13
 */
public class Main {
    
    public static void main(String[] args) {
    
        // Crear plan
        Plan planBasico = new Plan(500, 10, 1500);
        
        // Crear un cliente con ese plan
        Cliente cliente1 = new Cliente("Alexis Encanacion", "829-356-1305", planBasico);
        
        // Crear factura consumo real
        Factura factura1 = new Factura(cliente1, 600, 5);
        
        // Generar factura
        factura1.generarFactura();
    }
}
