/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroacademico;

/**
 *
 * @author DAWRY13
 */
public class Estudiante {
    private String nombre;
    private String mstricula;
    private String carrera;
    
    
    private double practicas;
    private double parciales;
    private double asignaciones;
    private double examenfinal;
    
    public Estudiante(String nombre, String matricula, String carrera,
        double practicas, double parciales, double asignaciones, double examenfinal) {
        this.nombre = nombre;
        this.mstricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenfinal = examenfinal;
    }
    
    public double calcularNotaFinal(){
        return practicas + parciales + asignaciones + examenfinal;
    }
    
    public String obtenerResultado(){
        return calcularNotaFinal() >= 70 ? "APROBADO" : "REPROBADO";
    }
}
