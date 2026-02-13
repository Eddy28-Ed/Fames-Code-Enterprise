/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAWRY13
 */
public class Main {
    
    public static void main(String[] args) {
    
        // Crear libro 
        Libro libro1 = new Libro ("Cien Anos de Soledad", "Grabiel Garcia Marquez", "12345");
         
         // Crear usuario
         Usuario usuario = new Usuario("Alexis Encarnacion ", "U001");
         
         // Prestar libro
         usuario.prestarLibro(libro1);
         
         // Crear registro de prestamo
         Prestamo prestamo1 = new Prestamo(usuario, libro1);
         prestamo1.mostarPrestamo();
         
         // Devolver libro
         usuario.devolverLibro(libro1);
         
         // Consultar disponibilidad
         if (libro1.consultarDisponibilidad()) {
         
             System.out.println("El libro esta disponible");
         } else {
         
             System.out.println("El libro no esta disponible");
         }
         
         
         
    }
    
}
