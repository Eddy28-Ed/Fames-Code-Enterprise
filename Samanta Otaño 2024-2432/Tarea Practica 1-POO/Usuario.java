package holamundo;

    import java.util.ArrayList;

public class Usuario {

    private final String nombre;
    private String id;
    private final ArrayList<Libro> librosPrestados;

    // Constructor
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados a " + nombre + ":");
        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro.getTitulo());
        }
    }

    public String getNombre() {
        return nombre;
    }
}
