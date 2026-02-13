/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author EDWARD
 */
public class Prueba {
    
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Suma (2 params): " + calc.sumar(3,5));
        System.out.println("Resta (2 params): " + calc.restar(8,7));
        System.out.println("Multiplicion(2 params): " + calc.multiplicacion(14,5));
        System.out.println("Division (2 params): " + calc.division(8,2));
        
        System.out.println("=============================");
        
        System.out.println("Suma (3 params): " + calc.sumar(5,8,12));
        System.out.println("Resta (3 params): " + calc.restar(5,41,26));
        System.out.println("Multiplicacion (3 params): " + calc.multiplicacion(14,5,6));
        
        System.out.println("=============================");
        
        System.out.println("Suma (4 params): " + calc.sumar(5,24,5,62));
        System.out.println("Resta (4 params): " + calc.restar(51,24,5,15));
        System.out.println("Multiplicacion (4 params): " + calc.multiplicacion(41,5,63,4));
        
    }
    
}
