package holamundo;

public class MainVehiculo {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("A123BC");
        Vehiculo v3 = new Vehiculo("B456CD", "Toyota", "Corolla");

        v3.mostrarInfo();

        System.out.println("\nMantenimiento básico: " + v3.calcularMantenimiento(10000));
        System.out.println("Mantenimiento premium: " + v3.calcularMantenimiento(10000, "premium"));
        System.out.println("Mantenimiento completo: " + v3.calcularMantenimiento(10000, "premium", 5));
    }
}

