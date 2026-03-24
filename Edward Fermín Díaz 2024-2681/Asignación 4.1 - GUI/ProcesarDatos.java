/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz.gráfica;

/**
 *
 * @author EDWARD
 */
public class ProcesarDatos {
    
private String matricula;
    private String nombres;
    private String apellidos;
    private String cuatrimestre;

    public void capturarDatos(String matricula, String nombres, String apellidos, String cuatrimestre) {
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuatrimestre = cuatrimestre;
    }

    public String presentarDatos() {
        if (matricula == null || nombres == null || apellidos == null || cuatrimestre == null) {
            return null;
        }

        return "Matrícula: " + matricula +
               "\nNombre: " + nombres +
               "\nApellido: " + apellidos +
               "\nCuatrimestre: " + cuatrimestre;
    }
    
    
}
