/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package como.ejerciciojava;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Ejercicio1 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
          String passcode_correcto = "francis"; 
        
         System.out.println("ingresar passcode");
         String passcode = sc.next();
         
         while (!passcode.equals(passcode_correcto)){
             System.out.println("passcode incorrecto, intentolo de nuevo");
             passcode = sc.next();
         }
         
         System.out.println("Bienvenido al sistema");
    }
}
