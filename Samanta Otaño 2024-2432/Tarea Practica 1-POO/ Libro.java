package holamundo;

public class Libro {


    private final String titulo;
    private final String autor;
    private final String isbn;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    // Método para consultar disponibilidad
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro() {
        disponible = true;
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }

    public String getTitulo() {
        return titulo;
    }
}
