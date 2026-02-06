/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author EDWARD
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int numero = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El numero es par");
        } else{
            System.out.println("El numero es impar");
        }
    }
    
}
