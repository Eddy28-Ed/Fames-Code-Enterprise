/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author EDWARD
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int primerNumero = 0;
        int segundoNumero = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        primerNumero = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        segundoNumero = sc.nextInt();
        
        if (primerNumero > segundoNumero){
            System.out.println("El mayor es: " + primerNumero);
            System.out.println("El menor es: " + segundoNumero);
        }else if (segundoNumero > primerNumero){
            System.out.println("El mayor es: " + segundoNumero);
            System.out.println("El menor es: " + primerNumero);  
        }else{
            System.out.println("Ambos son iguales");
        }
        
    }
    
}
