/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author EDWARD
 */
public class Calculadora {

   
    
    public int sumar(int valor1, int valor2){
        return valor1 + valor2;  
    }
    
    public int restar(int valor1, int valor2){
        return valor1 - valor2;
    }
    
    public int multiplicacion(int valor1, int valor2){
        return valor1 * valor2;
    }
    
    public int division(int valor1, int valor2){
        if(valor2 != 0){
            return valor1 / valor2;
        }else{
           return 0;
        }  
    }
    
    public int sumar(int valor1, int valor2, int valor3){
            return valor1 +valor2 + valor3;
    }
    
    public int restar(int valor1, int valor2, int valor3){
        return valor1 - valor2 - valor3;
    }
    
    public int multiplicacion(int valor1, int valor2, int valor3){
        return valor1 * valor2 * valor3;
    }
    
    public int sumar(int valor1, int valor2, int valor3, int valor4){
        return valor1 + valor2 + valor3 + valor4;
    }
    
    public int restar(int valor1, int valor2, int valor3, int valor4){
        return valor1 - valor2 - valor3 - valor4;
    }
    
    public int multiplicacion(int valor1, int valor2, int valor3, int valor4){
        return valor1 * valor2 * valor3 * valor4;
    }
}
