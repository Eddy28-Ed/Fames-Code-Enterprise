/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAWRY13
 */
public class MainVehiculo {
    
    public static void main(String[] args) {
    
        // === Constructor por defecto ===
        
        Vehiculo vehiculo1 = new Vehiculo();
        System.out.println("=== Vehiculo 1 (Costructor por defecto) ===");
        vehiculo1.mostrarInformacion();
        System.out.println("Costo mantenimiento: $" + 
                vehiculo1.calcularMantenimiento(10000));
        
        
        
          // === Costructor basico ===
          
        Vehiculo vehiculo2 = new Vehiculo("A123BC");
        System.out.println("\n=== Vehiculo 2 (Constructor basico) ===");
        vehiculo2.mostrarInformacion();
        System.out.println("Costo mantenimiento: $" +
                vehiculo2.calcularMantenimiento(15000, "basico"));
        
        

        // === Costructor completo ===
        
        Vehiculo vehiculo3 = new Vehiculo("B456CD", "Toyota","2022");
        System.out.println("\n=== Vehiculo 3 (Constructor completo) ===");
        vehiculo3.mostrarInformacion();
        System.out.println("Costo mantenimiento con descuento: $" +
                vehiculo3.calcularMantenimiento(20000, "completo", 10));
        
        
    }
    
    
}
