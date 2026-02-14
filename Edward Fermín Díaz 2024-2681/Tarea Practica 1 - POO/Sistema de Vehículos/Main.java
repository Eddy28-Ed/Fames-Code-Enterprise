/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.vehículos;

/**
 *
 * @author EDWARD
 */
public class Main {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo veh1 = new Vehiculo();
        Vehiculo veh2 = new Vehiculo("EDF202001");
        Vehiculo veh3 = new Vehiculo("EDF2801", "Honda", "Civic");

        veh3.mostrarInfo();

        System.out.println("Costo mantenimiento (50000 km): " +
                veh3.calcularMantenimiento(50000));

        System.out.println("Costo mantenimiento completo: " +
                veh3.calcularMantenimiento(50000, "completo"));

        System.out.println("Costo mantenimiento urgente: " +
                veh3.calcularMantenimiento(50000, "completo", true));
        
    }
    
}
