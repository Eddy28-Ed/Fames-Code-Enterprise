/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramatematica;

import java.util.Scanner;

/**
 *
 * @author DAWRY13
 */

public class CalculadoraMatematica {

//Atributos privados
private double numero1;
private double numero2;

//constructor por defecto
public CalculadoraMatematica () {
    
    numero1 = 0;
    numero2 = 0;

}

//metodo para ingresar numero
public void ingresarNumeros(double numero1, double numero2){
    this.numero1 = numero1;
    this.numero2 = numero2;

}
//metodo suma
public double sumar () {
    return numero1 + numero2;
}

//metodo resta
public double restar () {
    return numero1 - numero2;
}

//metodo multiplicar
public double multiplicar () {
    return numero1 * numero2;
}

//metodo dividir
public double dividir (){
    if (numero2 == 0) {
        throw new ArithmeticException("No se puede dividir entre cero.");
    
    }
    return numero1 / numero2;

}

//metod principal
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        int opcionMenu;
        
        do {
            System.out.println("\n===== CALCULADORA MATEMÁTICA =====");
            System.out.println("1. Ingresa NUmeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Salir ");
            
            opcionMenu = scanner.nextInt();
            
            switch (opcionMenu) {
                
                case 1: {
                    System.out.println("Ingrse el primer numero: ");
                    double num1 = scanner.nextDouble();
                    
                    System.out.println("Ingresee el segundo numero: ");
                    double num2 = scanner.nextDouble();
                    
                    calculadora.ingresarNumeros(num1, num2);
                    System.out.println("Números ingresados correctamente.");
                }

                case 2: 
                    System.out.println("Resultado de la suma: " + calculadora.sumar());

                case 3: 
                    System.out.println("Resultado de la resta: " + calculadora.restar());

                case 4: 
                    System.out.println("Resultado de la multiplicación: " + calculadora.multiplicar());

                case 5: 
                {
                    try {
                        System.out.println("Resultado de la división: " + calculadora.dividir());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 6: 
                    System.out.println("¡Gracias por usar la calculadora!");

                default: 
                    System.out.println("Opción inválida.");
            }

        } while (opcionMenu != 0);
    }
    }
}