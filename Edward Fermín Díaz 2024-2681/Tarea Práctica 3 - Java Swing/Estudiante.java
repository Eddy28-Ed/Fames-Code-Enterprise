/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro.académico;

/**
 *
 * @author EDWARD
 */
public class Estudiante {
    
    private String nombre;
    private String matricula;
    private String carrera;
    private double practicas, parciales, asignaciones, examen;

    public Estudiante(String nombre, String matricula, String carrera,
                      double practicas, double parciales,
                      double asignaciones, double examen) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examen = examen;
    }

    public double calcularNotaFinal() {
        return practicas + parciales + asignaciones + examen;
    }

    public String getResultado() {
        return calcularNotaFinal() >= 60 ? "APROBADO" : "REPROBADO";
    }
}
