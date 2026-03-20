/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EDWARD
 */
class Calculadora {
    
    public double sumar (double valor1, double valor2){
        return valor1 + valor2;
    }
    
    public double restar (double valor1, double valor2){
        return valor1 - valor2;
    }
      
    public double multiplicar(double valor1, double valor2){
    
        return valor1 * valor2;
    }
    
    public double dividir(double valor1, double valor2){
    
        if (valor2 != 0){
            return valor1 / valor2;
        }else{
            return 0;
        }
    }
    
    public double fahrenheit(double valor1){
        double fahrenheit = (valor1 * 9/5) + 32;
        return fahrenheit;
    }
    
        // Método para convertir de Fahrenheit a Celsius
    public double celsius(double valor1){
        double celsius = (valor1 - 32) * 5/9;
        return celsius;
    }
    
    public double raiz(double valor1){
        return Math.sqrt(valor1);    
    }
    
    public double exponente(double valor1, double valor2){
    return Math.pow(valor1, valor2);
    }
    
}
