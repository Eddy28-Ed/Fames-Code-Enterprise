/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeropar.impar;

/**
 *
 * @author DAWRY13
 */

import java.util.Scanner;

public class NumeroParImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        
        if (numero %2 == 0) {
            System.out.println("El numero " + numero + " es PAR");
        
        } else {
            System.out.println("El numero " + numero + " es IMPAR");
        
        }
    }
}
