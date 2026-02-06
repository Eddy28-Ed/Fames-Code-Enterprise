/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumatoria;

/**
 *
 * @author DAWRY13
 */
public class Sumatoria {

    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        
        do {
            suma = suma +i;
            i++;
        } while (i <= 50);
        
       System.out.println("La sumatoria del 1 al 50 es :" + suma);
    }
}
