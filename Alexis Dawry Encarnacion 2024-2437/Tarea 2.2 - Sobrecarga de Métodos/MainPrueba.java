/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcualadora;

/**
 *
 * @author DAWRY13
 */
public class MainPrueba {
    
    public static void main(String[] args) {
    
        Calculadora calc = new Calculadora();
        
        // ===============================
        // PRUEBAS CON 2 PARÁMETROS
        // ===============================
        
        System.out.println("suma (2 parames): " + calc.sumar(5,3));
        System.out.println("Resta (2 params): " + calc.restar(10, 4));
        System.out.println("Multiplicacion (2 params): " + calc.multiplicar(6, 7));
        System.out.println("Division (2 params: ) " + calc.dividir(20, 4));
        
        
        // ===============================
        // PRUEBAS CON 3 PARÁMETROS
        // ===============================
        
        System.out.println("suma (3 parames): " + calc.sumar(5, 3, 2));
        System.out.println("Resta (3 params): " + calc.restar(10, 4, 2));
        System.out.println("Multiplicacion (3 params): " + calc.multiplicar(2, 3, 4));
        
        
        
        // ===============================
        // PRUEBAS CON 4 PARÁMETROS
        // ===============================
        
        System.out.println("suma (4 parames): " + calc.sumar(1, 2, 2, 4));
        System.out.println("Resta (4 params): " + calc.restar(20, 5, 3, 2));
        System.out.println("Multiplicacion (4 params): " + calc.multiplicar(2, 2, 2, 2));
    }
}
