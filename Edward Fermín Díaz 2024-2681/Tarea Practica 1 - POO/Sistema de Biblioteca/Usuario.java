/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDWARD
 */
public class Usuario {
    
        // Atributos privados
    private String nombre;
    private String id;
    private List<Libro> LibrosPrestados;
    
    
    // Constructor de la clase usuario
    public Usuario(String nombre, String id) {
    
        this.nombre = nombre;
        this.id = id;
        this.LibrosPrestados = new ArrayList<>();
    }
    
    
    // Metodo para prestar libro al usuario
    public void prestarLibro(Libro Libro) {
    
        if (Libro.consultarDisponibilidad()) {
            Libro.prestarLibro();
            LibrosPrestados.add(Libro);
            System.out.println( nombre + " ha tomado prestado el libro. " );
        } else {
        
            System.out.println("No se puede prestar el libro a " + nombre);
        }
    }
    
    // Metodo para devolver libro
    public void devolverLibro(Libro libro) {
    
        if (LibrosPrestados.contains(libro)) {
        
            libro.devolverLibro();
            LibrosPrestados.remove(libro);
            System.out.println(nombre + " ha devuelto el libro. ");
        } else {
        
            System.out.println(nombre + " no tiene este libro prestado. ");
        }
    }
    
    
    // Getter
    public String getNombre() {
    
        return nombre;
    }
    
    public String getId() {
     return id;
    }
    
}
