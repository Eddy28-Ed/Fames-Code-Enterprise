/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAWRY13
 */
public class Libro {
    
    // Atributos privados (Encapsulamiento)
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
    
    
    // Constructor de la clase Libro
    public Libro(String titulo, String autor, String isbn) {
    
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; 
    }
        
        // Metodo para consultar disponibilidad
        public boolean consultarDisponibilidad() {
            
            return disponible;
        }
        
        
        // Metodo para prestar el libro
        public void prestarLibro() {
        
            if (disponible) {
            
                disponible = false;
                System.out.println("El libro " + titulo + " ha sido prestado");
            } else {
            
                System.out.println("El libro " + titulo + " no esta disponible");
            }
        }
        
        
        // Metodo para devolver el libro 
        public void devolverLibro() {
        
            disponible = true;
            System.out.println("El libro " + titulo + " ha sido devuelto");
        }
        
        public String getTitulo() {
        
            return titulo;
        } 
        
        
        // Ghetters
        public String getAutor() {
        
            return autor;
        } 
        
        public String getIsbn() {
        
            return isbn;
        } 
    
    
}
