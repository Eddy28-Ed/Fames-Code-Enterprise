/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package como.calculadoramatematicajava.calculadoramatematica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

public class calculadoramatematica {
    
    //TRAIBUTOS PRIVADOS
    private double numero1;
    private double numero2;
    
    public void ingresarnumeros( Scanner leer){
        System.out.println("\n === Agregar valores ===");
        System.out.println("Ingresa el primer valor:");
        numero1 = leer.nextDouble();
        
        System.out.println("Ingrese el segundo nuemro:");
        numero2 = leer.nextDouble();
    }
            
    // GETTERS
    public double getnumero1(){
        return numero1;
    }
    
    public double getnumero2(){
        return numero2;
    }
    
    //OPERACIONES MATEMATICAS
    public double suma(){
        
        return this.numero1 + this.numero2;
    }
    
    public double resta(){
        return this.numero1 - this.numero2;
    }
    
    public double multiplicacion(){
        return this.numero1 * this.numero2;
    }
    
    public double divicion(){
        if (this.numero1 == 0 ){
            System.out.println("NO SE PUEDE DIVIDIR POR CERO");
            return 0.0;
        }
       return this.numero1 / this.numero2;
    }  
   

    public static void main(String[] args) {
        
        
        //AQUI IMPORTAMOS EL SCANNER
        Scanner leer = new Scanner(System.in);
        // CREAMOS EL OBJERO PARA PODER LLAMAR A LOS METODOS
        calculadoramatematica cal = new calculadoramatematica();
        // declaramos la variable para el menu
       int menu = 0;
        
       do{
           // EL MENU DEL PROGRAMA
           System.out.println("======== CALCULADORA MATEMATICA ========");
           System.out.println("1: Agregar valores");
           System.out.println("2: suma (+)");
           System.out.println("3: Resta (-)");
           System.out.println("4: multiplicacion (*)");
           System.out.println("5: divicion (/)");
           System.out.println("0: Salir");
           System.out.println("==========================================");
           System.out.println("");
           System.out.println("Elige una Opcion!");
           menu = leer.nextInt();
           
           //AQUI ES PARA QUE EL USUARIO EJECUTE LA OPERACION QUE QUIERA UTILIZAR
           switch(menu){
               case 1 -> cal.ingresarnumeros(leer);//AQUI SE INGRESAN LOS NUMEROS
                   
               case 2 -> System.out.println("el resultado de operacion es: "+ cal.suma());// RESULTADO DE LA SUMA
                   
               case 3 -> System.out.println("el resultado de operacion es: "+ cal.resta());//RESULTADO DE LA RESTA
                   
               case 4 -> System.out.println("el resultado de operacion es: "+ cal.multiplicacion());//RESULTADO DE LA MULTIPLICACION
                   
               case 5 -> System.out.println("el resultado de operacion es: "+ cal.divicion());// RESULTADO DE LA DIVICION
                   
               case 0 -> System.out.println("SALIENDO"); // SALIDA DEL PROGRAMA
               default -> System.out.println("OPCION NO VALIDA");              
           }
       }while(menu != 0);   
       
       leer.close();
    }  
}


