/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author User
 */
public class Estudiante {

    private String nombre;
    private String matricula;
    private String carrera;

    private double practicas;
    private double parciales;
    private double asignaciones;
    private double examen;

    // Método para capturar datos
    public void capturarDatos(String nombre, String matricula, String carrera,
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

    // Calcular nota final
    public double calcularNotaFinal() {
        return practicas + parciales + asignaciones + examen;
    }

    // Determinar estado
    public String obtenerEstado() {
        if (calcularNotaFinal() >= 60) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }

    // Mostrar resultado completo
    public String mostrarResultado() {
        return "Nombre: " + nombre +
               "\nMatrícula: " + matricula +
               "\nCarrera: " + carrera +
               "\nNota Final: " + calcularNotaFinal() +
               "\nEstado: " + obtenerEstado();
    }
}
