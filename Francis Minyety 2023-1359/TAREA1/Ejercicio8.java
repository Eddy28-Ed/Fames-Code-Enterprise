/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package como.ejerciciojava.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("determinar si un numero es impar o par");
        
        Scanner leer = new Scanner(System.in);
        
         System.out.println("digite un numero");
         int a = leer.nextInt();
         
         if (a % 2 == 0){
             System.out.println("este numero : " + a + " es par");
         }else{
             System.out.println("este numero : " + a + " es impar ");
         }
    }
}
