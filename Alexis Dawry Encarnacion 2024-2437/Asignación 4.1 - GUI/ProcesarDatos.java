/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.procesardatos;

/**
 *
 * @author DAWRY13
 */
public class ProcesarDatos {
    //metodos privados
    private String matricula; 
    private String nombres; 
    private String apellidos; 
    private String cuatrimestre; 
    
    //metodo para capturar datos
    public void capturarDatos(String matricula, String nombres,String apellidos,String cuatrimestre){
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuatrimestre = cuatrimestre;
    }
    
    //metodo para presentar datos
    public String procesarDatos(){
        return "Matricula: " + matricula +
                "\nNombres: " + nombres +
                "\nApellidos: " + apellidos +
                "\nCuatrimestre: " + cuatrimestre;
                
    }

    public String presentarDatos() {
         return procesarDatos();
    }
    
}
