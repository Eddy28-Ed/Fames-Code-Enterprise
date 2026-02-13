
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAWRY13
 */
public class Prestamo {
    
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;
    
    public Prestamo(Usuario usuario, Libro libro) {
    
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }
    
    public void mostarPrestamo() {
    
        System.out.println("Fecha: " + fecha);
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
    }
}
