/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.biblioteca;

/**
 *
 * @author EDWARD
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // esta disponible desde el inicio hasta que se tome prestado
    }

    // Método para consultar disponibilidad del libro
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    // Método para prestar el libro
    public void prestarLibro() {
        if (disponible) {
            disponible = false;
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    // Método para el devolver libro
    public void devolverLibro() {
        disponible = true;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }
    
}
