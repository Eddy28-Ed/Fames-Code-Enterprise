/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package como.tarea2java.tarea2;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Tarea2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // pedimos los valores por consola
        System.out.println("marca de su tv:");
        String marca = sc.nextLine(); //es mejor usar nextLine para que lea varias palabras
        
        System.out.println("pulgadas: ");
        int pulgadas = sc.nextInt();
        
        System.out.println("volumen: ");
        int volumen = sc.nextInt();
        
        //creamos un objeto en base al constructor
        Tv miTv = new Tv(marca, pulgadas,volumen);
        
       //aqui creamos un menu para la acciones 
       
       //creamos una variable para el menu
       int menu;
       
       //MENU!
       
       System.out.println("elige una accion");
       System.out.println("");
       System.out.println("1: encender");
       System.out.println("2: apagar");
       System.out.println("3: subir volumen");
       System.out.println("4: bajar volumen");
       System.out.println("5: salir");
       menu = sc.nextInt();
       
       switch (menu){
           case 1:
               miTv.encencer();
               break;
               
           case 2:
               miTv.apagar();
               break;
               
           case 3:
               miTv.subirVolumen();
               break;
               
           case 4:
               miTv.bajandoVolumen();
               break;
               
           case 5:
               System.exit(menu);
              
       }
    }
}

// CREAMOS UNA CLASE
class Tv {
    // ATRIBUTOS
    String marca;
    int pulgadas;
    int volumen;

     //CONSTRUCTOR
    public Tv (String marca, int pulgadas, int volumen){
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.volumen = volumen;
    }
    
    public void encencer(){
        System.out.println("el tv esta encendiendo...");
    }
    
    public void subirVolumen(){
        System.out.println("subiendo el volumen...");
    }
    
    public void bajandoVolumen(){
        System.out.println("bajando volumen...");
    }
    
    public void apagar(){
        System.out.println("apagando...");
    }
    
    
}

