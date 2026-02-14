/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.vehículos;

/**
 *
 * @author EDWARD
 */
public class Vehiculo {
    
    private String placa;
    private String marca;
    private String modelo;

    // constructor por defecto
    public Vehiculo() {
        this.placa = "Sin placa";
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    // constructor basico
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    // constructor completo
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodo sobrecargado 1: Solo kilómetros
    public double calcularMantenimiento(int km) {
        return km * 0.05;  // Costo base por kilometro
    }

    // Metodo sobrecargado 2: Kilómetros + tipo de servicio
    public double calcularMantenimiento(int km, String tipoServicio) {
        double costoBase = km * 0.05;
        
        if (tipoServicio.equalsIgnoreCase("basico")) {
            return costoBase + 50;
        } else if (tipoServicio.equalsIgnoreCase("completo")) {
            return costoBase + 100;
        } else {
            return costoBase + 30; // servicio estándar
        }
    }

    // Metodo sobrecargado 3: Kilometros + tipo de servicio + urgencia
    public double calcularMantenimiento(int km, String tipoServicio, boolean urgente){
        double costo = calcularMantenimiento(km, tipoServicio);
        if (urgente) {
            costo += 75; // recargo por urgencia
        }
        return costo;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
}
