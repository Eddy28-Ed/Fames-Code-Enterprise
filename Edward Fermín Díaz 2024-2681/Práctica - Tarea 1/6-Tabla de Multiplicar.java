/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author EDWARD
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        
        System.out.println("=== Tabla del " + numero + " ===");
        
        for(int i= 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    
}
