/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones_basicas;

/**
 *
 * @author DAWRY13
 */
public class Operaciones_Basicas {

    public static void main(String[] args) {
    
    //1. Decalacion de variales
    double num1 = 50;
    double num2 = 10;
    
    //2. Realizar las operaciones
    double suma = num1 + num2;
    double resta = num1 - num2;
    double multiplicacion = num1 * num2;
    double division = num1 / num2;

    // 3. Mostrar resultados
        System.out.println("Resultados de las operaciones:");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("División: " + num1 + " / " + num2 + " = " + division);
    }
}

