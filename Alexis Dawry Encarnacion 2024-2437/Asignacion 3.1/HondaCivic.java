/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil;

/**
 *
 * @author DAWRY13
 */
public class HondaCivic extends AutoMovil {
    // Constructor
    public HondaCivic(){
        super(); //Llama al constructor de automovil
        System.out.println("Constructor de Honda civic");
    }
    
    //Sobrescritura de metodos
    @Override
    public void encender(){
         System.out.println("El Honda civic esta encendido con arranque deportivo");
    }
    @Override
    public void acelerar(){
         System.out.println("El Honda civic esta acelereando rapidamente");
    }
}
