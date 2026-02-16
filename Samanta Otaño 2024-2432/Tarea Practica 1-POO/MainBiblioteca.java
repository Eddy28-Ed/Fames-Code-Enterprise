package holamundo;

public class MainBiblioteca {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "12345");
        Usuario usuario1 = new Usuario("Samanta Otaño", "U001");

        Prestamo prestamo1 = new Prestamo(usuario1, libro1);

        prestamo1.realizarPrestamo();

        usuario1.mostrarLibrosPrestados();

        libro1.devolverLibro();
    }
}
