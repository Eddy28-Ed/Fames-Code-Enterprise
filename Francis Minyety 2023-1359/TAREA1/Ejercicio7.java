/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package como.ejerciciojava.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("comparar dos numeros (mayor y menor)");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("inserte primer valor");
        int a =  leer.nextInt();
        System.out.println("inserte segundo valor");
        int b = leer.nextInt();
        
        if (a > b){
            System.out.println("el valor " + a + "es mayor ");
           
        }else {
            System.out.println("el valor " + b + " es mayor");
        }
        

    }
}
