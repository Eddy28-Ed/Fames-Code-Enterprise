/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa.de.telefonía;

/**
 *
 * @author EDWARD
 */
class Plan {
    
     // Atributos privados
    private int minutosIncluidos;
    private double datosGB;
    private double precioMensual;
    
    // Constructor
    public Plan(int minutosIncluidos, double datosGB, double precioMensual) {
    
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
        
    } 

        // Getters
        public int getMinutosIncluidos() {
        
            return minutosIncluidos;
        }
        
        public double getDatosGB() {
        
            return datosGB;
        }
        
        public double getPrecioMensual() {
        
            return precioMensual;
        }
        
       // Metodo para mostrar informacion del plan
        public void mostrarPlan() {
        
            System.out.println("Minutos incluidos: " + minutosIncluidos);
            System.out.println("Datos incluidos (GB): " + datosGB);
            System.out.println("Precio mensual: $" + precioMensual);
        }
        
    
}
