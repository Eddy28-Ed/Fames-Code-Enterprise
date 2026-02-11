/*
 * Programa: Calculadora matematica
 *Descripcion:
 *Calculadora basica que sirve para hacer operaciones basicas
 *Sumar
 *Restar
 *Dividir
 *Multiplciar
 * Mediante el uso de un menu interactivo permite al usuario seleccionar lo que desea realizar hasta que decida salir
 */
package calculadoramatematica; // Paquete donde se encuentra la clase
import java.util.Scanner; // Importación de la clase Scanner para leer datos desde el teclado

/**
 *
 * @author EDWARD
 */

 /**
 * Clase principal que contiene el método main y los métodos matemáticos de la calculadora.
 */
public class CalculadoraMatematica {
    
    
     /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  // Objeto Scanner para capturar datos ingresados por el usuario
        var opcionMenu = 0;  // Variable para almacenar la opción seleccionada del menú
        
        // Variables para almacenar los números ingresados
        double numero1 = 0; 
        double numero2 = 0;
        
        /*
         * Estructura do-while
         * Se ejecuta al menos una vez y se repite hasta que el ususario ingrese el 0 apra salir
         */
        
        do{  
         
            // Mostrar las opciones que contiene el menu
         System.out.println("==== Calculadora MATEMÁTICA =====");
         System.out.println("1. Ingresar números");
         System.out.println("2. Sumar");
         System.out.println("3. Restar");
         System.out.println("4. Multiplicar");
         System.out.println("5. Divid1ir");
         System.out.println("0. Salir");
         System.out.println("==================================");
         
          // Para leer la opcion selccionada 
         System.out.println("Seleccione una opción:");
         opcionMenu =sc.nextInt();
         
         
         /*
         * Estructura SWITCH:
         * Evalúa la opción seleccionada y ejecuta la acción correspondiente.
         */
         switch(opcionMenu){
             
             // caso 1: ingesar los numeros
         
             case 1:
                 System.out.println("Ingrese el primer valor");
                 numero1 = sc.nextDouble();
                 System.out.println("Ingrese el segundo valor");
                 numero2 = sc.nextDouble();
                 break;
                 
                 
              // caso 2: suma
             case 2:
                 System.out.println("La suma de los valores es: " + calcularSuma(numero1,numero2));
                 break;
              
             // caso 3: resta
             case 3:
                 System.out.println("La resta de los valores es: "  + calcularResta(numero1,numero2));
                 break;
                 
             // caso 4: multiplicacion
             case 4:
                 System.out.println("El valor de la multiplicacion es: " + calcularMultiplicacion(numero1,numero2));
                 break;
                 
                 
              //caso 5: division
             case 5: 
                 System.out.println("La division de los numeros es: " + calcularDivision(numero1,numero2));
                 break;
                 
             // caso 6: salir
             case 0:
                 System.out.println("Gracias por utilizar la calculadora");
                 break;
                 
             // default en caso de ingresar un numero no valido devuelve mensaje dejando saber
             default:
                 System.out.println("El numero ingresado no es valido, seleccione una opcion del menu");
                 break;
                    
         }
     
     
     
     
     }while(opcionMenu !=0); // Condición para repetir el menu
        
        
    }
    
    /**
     * Método que realiza la suma de dos números.
     * 
     * @param numero1 Primer número
     * @param numero2 Segundo número
     * @return Resultado de la suma
     */
    
    public static double calcularSuma(double numero1,double numero2){
        
        return numero1 + numero2;
    }
    
    /**
     * Método que realiza la resta de dos números.
     * 
     * @param numero1 Primer número
     * @param numero2 Segundo número
     * @return Resultado de la resta
     */
    
    public static double calcularResta(double numero1,double numero2){
        
        return numero1 - numero2;
    }
    
    /**
     * Método que realiza la multiplicación de dos números.
     * 
     * @param numero1 Primer número
     * @param numero2 Segundo número
     * @return Resultado de la multiplicación
     */
    public static double calcularMultiplicacion(double numero1, double numero2){
    
        return numero1 * numero2;
    }
    
    /**
     * Método que realiza la división de dos números.
     * 
     * Valida que el divisor no sea 0 para evitar error matemático.
     * 
     * @param numero1 Dividendo
     * @param numero2 Divisor
     * @return Resultado de la división o 0 si el divisor es 0
     */
    
    public static double calcularDivision(double numero1, double numero2){
    
        if (numero2 != 0){
            return numero1 / numero2;
        }else{
            return 0;
        }
    }
    
}
