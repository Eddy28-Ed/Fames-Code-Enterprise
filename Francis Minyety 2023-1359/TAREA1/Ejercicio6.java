/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package como.ejerciciojava.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("tabla de multiblicar");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("que tabla quieres crear?");
        int tabla = leer.nextInt();
        
        for(int i = 1;i <= 12; i++){
            int resultado = tabla + i;
            System.out.println(tabla + " x " + i + " = " + resultado);
        }
    }
}
