package holamundo;

public class MainTelefonia {

    public static void main(String[] args) {

        Plan planBasico = new Plan(300, 10, 25.00);
        Cliente cliente1 = new Cliente("Samanta", "829-852-7746", planBasico);

        Factura factura1 = new Factura(cliente1, 350, 12);

        factura1.generarFactura();
    }
}


