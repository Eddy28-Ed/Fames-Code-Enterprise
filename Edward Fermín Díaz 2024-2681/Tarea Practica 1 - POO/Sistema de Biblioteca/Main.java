/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.biblioteca;

/**
 *
 * @author EDWARD
 */
public class Main {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear libro 
        Libro lib = new Libro ("La Mañosa", "Juan Bosch", "14527");
         
         // Crear usuario
         Usuario usuario = new Usuario("Edward Fermin ", "U01");
         
         // Prestar libro
         usuario.prestarLibro(lib);
         
         // Crear registro de prestamo
         Prestamo prestamo1 = new Prestamo(usuario, lib);
         prestamo1.mostarPrestamo();
         
         // Devolver libro
         usuario.devolverLibro(lib);
         
         // Consultar disponibilidad
         if (lib.consultarDisponibilidad()) {
             System.out.println("Libro disponible");
         } else {
         
             System.out.println("Libro disponible");
         }
         
         
         
    }
        
    }
