/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package como.ejerciciojava.ejercicio5;

/**
 *
 * @author franc
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("sumatoria de los numeros del 1 - 50");
        
       int suma =0; 
       int i = 1;
       
       
       do{
           suma = suma + i;
           i++;
       }while(i <= 50);
       System.out.println("la suma de todos los numeros es de: "+ suma);
    }
}
