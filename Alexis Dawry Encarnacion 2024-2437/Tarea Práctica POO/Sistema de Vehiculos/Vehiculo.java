/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAWRY13
 */
public class Vehiculo {
    
     // Atributos privados (encapsulamiento estricto)
    private String placa;
    private String marca;
    private String modelo;
    
    /**7
     * Constructor por defecto
     * Inicializa con valores predeteminados
     */
    
    public Vehiculo() {
    
        this.placa = "SIN-PLACA";
        this.marca = "DESCONOCIDA";
        this.modelo = "2024";
    }
    
    // constructor basico
    public Vehiculo(String placa) {
    
        this.placa = placa;
        this.marca = "DESCONOCIDA";
        this.modelo = "2024";
    }
    
     // constructor completo
    public Vehiculo(String placa, String marca, String modelo) {
    
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Metodos Getter y Setter
    public String getPlaca() {
    
        return placa;
    }
    
    public String getMarca() {
    
        return marca;
    }
    
    public void setModelo(String modelo) {
    
        this.modelo = modelo;
    }
    
    
    // ===================================
    // Métodos Sobrecargados
    // ===================================
    
    // Calcular mantenimiento solo de kilometraje
    public double calcularMantenimiento(int km) {
    
        return km * 0.05; // costo base por kilometro
    }
    
    // Calcula mantenimiento con kilometraje y tipo de servicio
    
    public double calcularMantenimiento(int km, String tipoServicio) {
    
        double costoBase = km * 0.05;
        
        if (tipoServicio.equalsIgnoreCase("basico")) {
        
            return costoBase + 50;
            
        } else if (tipoServicio.equalsIgnoreCase("completo")) {
        
            return costoBase + 150;
            
        } else {
        
            return costoBase + 30;
        }
    }
    
    /**
     * Calcula mantenimiento con kilometraje,
     * tipo de servicio y descuento.
     * @param km
     * @param tipoServicio
     * @param descuento
     * @return 
     */
    
    public double calcularMantenimiento(int km, String tipoServicio, double descuento) {
    
        double costo = calcularMantenimiento(km, tipoServicio);
        return costo - (costo * descuento / 100);
    }
    
    // Metodo para mostrar informacion del vehiculo
    public void mostrarInformacion() {
        
        System.out.println("placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

}
