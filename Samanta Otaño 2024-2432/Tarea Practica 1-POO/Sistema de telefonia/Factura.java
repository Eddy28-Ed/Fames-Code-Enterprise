package holamundo;

public class Factura {

    private Cliente cliente;
    private int minutosConsumidos;
    private double datosConsumidos;

    public Factura(Cliente cliente, int minutosConsumidos, double datosConsumidos) {
        this.cliente = cliente;
        this.minutosConsumidos = minutosConsumidos;
        this.datosConsumidos = datosConsumidos;
    }

    public double calcularTotal() {

        Plan plan = cliente.getPlan();
        double total = plan.getPrecioMensual();

        // Cargo por exceso de minutos
        if (minutosConsumidos > plan.getMinutosIncluidos()) {
            int excesoMinutos = minutosConsumidos - plan.getMinutosIncluidos();
            total += excesoMinutos * 0.50;
        }

        // Cargo por exceso de datos
        if (datosConsumidos > plan.getDatosGB()) {
            double excesoDatos = datosConsumidos - plan.getDatosGB();
            total += excesoDatos * 5.00;
        }

        return total;
    }

    public void generarFactura() {

        System.out.println("===== FACTURA =====");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Número: " + cliente.getNumeroTelefonico());
        System.out.println("Plan mensual: $" + cliente.getPlan().getPrecioMensual());
        System.out.println("Minutos consumidos: " + minutosConsumidos);
        System.out.println("Datos consumidos (GB): " + datosConsumidos);
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}

