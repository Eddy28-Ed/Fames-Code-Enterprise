package holamundo;

public class Tv {

    // Atributos
    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;

    // Método para encender la TV
    public void encender() {
        encendido = true;
        System.out.println("La TV se está encendiendo...");
    }

    // Método para apagar la TV
    public void apagar() {
        encendido = false;
        System.out.println("La TV se está apagando...");
    }

    // Método para subir volumen
    public void subirVolumen() {
        volumen++;
        System.out.println("Subiendo el volumen...");
    }

    // Método para bajar volumen
    public void bajarVolumen() {
        volumen--;
        System.out.println("Bajando el volumen...");
    }
}
