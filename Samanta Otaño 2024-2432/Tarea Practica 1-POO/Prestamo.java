package holamundo;

 import java.time.LocalDate;

public class Prestamo {

    private final LocalDate fecha;
    private final Usuario usuario;
    private final Libro libro;

    // Constructor
    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }

    public void realizarPrestamo() {
        if (libro.consultarDisponibilidad()) {
            libro.prestarLibro();
            usuario.agregarLibro(libro);
            System.out.println("Préstamo realizado el día: " + fecha);
        } else {
            System.out.println("No se puede realizar el préstamo.");
        }
    }
}