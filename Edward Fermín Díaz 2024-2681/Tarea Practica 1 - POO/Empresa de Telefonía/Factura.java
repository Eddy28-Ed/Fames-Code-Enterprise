/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa.de.telefonía;

/**
 *
 * @author EDWARD
 */
public class Factura {
    
     // Atributos privados
    private Cliente cliente;
    private int minutosUsados;
    private double datosUsadosGB;
    
    // Tarifas por exceso
    private static final double COSTO_MINUTOS_EXTRA = 2.50;
    private static final double COSTO_GB_EXTRA = 5.00;
    
    // Constructor 
    public Factura(Cliente cliente, int minutosUsados, double datosUsadosGB) {
    
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsadosGB = datosUsadosGB;
    }
    
    
    // Metodo para calcular exceso de minutos
    private double calcularExcesoMinutos() {
    
        Plan plan = cliente.getPlan();
        int exceso = minutosUsados - plan.getMinutosIncluidos();
        
        if (exceso > 0) {
        
            return exceso * COSTO_MINUTOS_EXTRA;
        }
        return 0;
    }
    
   
    // Metodo para calcular exceso de datos
    private double calcularExcesoDatos() {
    
        Plan plan = cliente.getPlan();
        double exceso = datosUsadosGB - plan.getDatosGB();
        
        if (exceso > 0) {
        
            return exceso * COSTO_GB_EXTRA;
        }
        return 0;
    }
    
    
    // Metodo para calcular el monto total
    public double calcularTotal() {
    
        Plan plan = cliente.getPlan();
        return plan.getPrecioMensual() +
                calcularExcesoMinutos() +
                calcularExcesoDatos();
    }
     
    
    // Metodo para generar la factura detallada
    public void generarFactura() {
    
        Plan plan = cliente.getPlan();
        
        System.out.println("=== FACTURA MENSUAL ===");
        cliente.mostarCliente();
        
        System.out.println("\n--- Plan Contratado ---");
        plan.mostrarPlan();
        
        System.out.println("\n--- Consumo ---");
        System.out.println("Minutos usados: " + minutosUsados);
        System.out.println("Datos usados: " + datosUsadosGB);
        
        double excesoMinutos = calcularExcesoMinutos();
        double excesoDatos = calcularExcesoDatos();
        double total = calcularTotal();
        
        System.out.println("\n--- Cargos por Exceso ---");
        System.out.println("Exceso por minutos: $" + excesoMinutos);
        System.out.println("Exceso por datos: $" + excesoDatos);
        
        System.out.println("\n total a pagar: $" + total);
    }
    
}
