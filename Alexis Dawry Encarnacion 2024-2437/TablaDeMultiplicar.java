/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablademultiplicar;

/**
 *
 * @author DAWRY13
 */

import java.util.Scanner;


public class TablaDeMultiplicar {

    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese un numero para ver su tabla de multiplicar: ");
            int numero = teclado.nextInt();
            
            System.out.println("\nTabla de multiplicar del " + numero);
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                
            }
        }
    }
}
