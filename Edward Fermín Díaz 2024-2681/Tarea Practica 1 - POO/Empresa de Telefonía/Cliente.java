/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa.de.telefonía;

/**
 *
 * @author EDWARD
 */
public class Cliente {
    
     // Atributos privados
    private String nombre;
    private String numeroTelefonico;
    private Plan plan;
    
    // Constructor
    public Cliente(String nombre, String numeroTelefonico, Plan plan) {
    
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }
    
    // Getters
    public String getNombre() {
    
        return nombre;
    }
    
    public String getNumeroTelefonico() {
    
        return numeroTelefonico;
    }
    
    public Plan getPlan() {
    
        return plan;
    }
    
    // Metodo para mostar informacion del cliente
    public void mostarCliente() {
    
        System.out.println("Cliente: " + nombre);
        System.out.println("Numero: " + numeroTelefonico);
    }
    
}
