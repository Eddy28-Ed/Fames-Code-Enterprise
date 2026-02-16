package holamundo;

public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    // Constructor básico (solo placa)
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    // Constructor completo
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor con valores por defecto
    public Vehiculo() {
        this.placa = "Sin placa";
        this.marca = "Genérica";
        this.modelo = "Base";
    }

    // ===== MÉTODOS SOBRECARGADOS =====

    // Solo kilómetros
    public double calcularMantenimiento(double km) {
        return km * 0.05;
    }

    // Kilómetros + tipo de servicio
    public double calcularMantenimiento(double km, String tipoServicio) {
        if (tipoServicio.equalsIgnoreCase("premium")) {
            return km * 0.08;
        } else {
            return km * 0.05;
        }
    }

    // Kilómetros + tipo de servicio + antigüedad
    public double calcularMantenimiento(double km, String tipoServicio, int antiguedad) {
        double costoBase;

        if (tipoServicio.equalsIgnoreCase("premium")) {
            costoBase = km * 0.08;
        } else {
            costoBase = km * 0.05;
        }

        return costoBase + (antiguedad * 10);
    }

    public void mostrarInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
