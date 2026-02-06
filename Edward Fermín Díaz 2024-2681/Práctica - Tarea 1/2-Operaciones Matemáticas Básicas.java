/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author EDWARD
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
       
    Scanner sc = new Scanner(System.in);
    var menu = 0;
    var a =0;
    var b = 0;
    
    while (menu != 6){
        System.out.println("---- CALCULADORA JAVA ----");
        System.out.println("1. Ingresar valores (a y b)");
        System.out.println("2. Suma");
        System.out.println("3. Resta");
        System.out.println("4. Multiplicacion");
        System.out.println("5. Division");
        System.out.println("6. Salir");
        menu = sc.nextInt();
        
        switch (menu){
            case 1:
                System.out.println("Ingresar valor [a]");
                a = sc.nextInt();
                System.out.println("Ingrese valor [b]");
                b = sc.nextInt();
                break;
               
            case 2:
                System.out.println("La suma de los valores es: " + suma(a,b));
                break;
            
            case 3:
                System.out.println("La resta de los valores es: " + resta(a,b));
                break;
                
            case 4:
                System.out.println("La multiplicacion de los valores es: " + multiplicacion(a,b));
                break;
                
            case 5: 
                System.out.println("La divicion de los valores es: " + division(a,b));
                break;
                
            case 6:
                System.exit(6);
                
            default:
                System.out.println("Numero ingresado no valido. Seleccione (1-6)");
            
        }
    }   
        
    }
    
    public static float suma(int a, int b){
        return a+b;
    }
    
    public static float resta (int a, int b){
        return a-b;
    }
    
    public static float multiplicacion (int a, int b){
        return a*b;
    }
    
    public static float division(int a, int b){
        if (a != 0) {
            return a/b;
        }else{
            return 0;
        }
    }
    
}
