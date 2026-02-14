/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa.de.telefonía;

/**
 *
 * @author EDWARD
 */
public class Main {
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         // Crear plan
        Plan planBasico = new Plan(700, 20, 2000);
        
        // Crear un cliente con ese plan
        Cliente cliente1 = new Cliente("Edward Fermin", "829-810-0609", planBasico);
        
        // Crear factura consumo real
        Factura factura1 = new Factura(cliente1, 400, 7);
        
        // Generar factura
        factura1.generarFactura();
    }
        
}
    
    
