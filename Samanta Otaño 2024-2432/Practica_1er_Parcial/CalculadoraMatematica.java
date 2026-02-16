
package holamundo;

    import java.util.Scanner;

public class CalculadoraMatematica {

/**
 * Clase CalculadoraMatematica
 * 
 * Implementa una calculadora básica con operaciones
 * matemáticas fundamentales utilizando programación
 * estructurada y principios básicos de POO.
 * 
 * @author Samanta
 */
    // ==========================
    // ATRIBUTOS PRIVADOS
    // ==========================
    private double numero1;
    private double numero2;

    /**
     * Constructor por defecto
     */
    public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    /**
     * Método para establecer los valores de los números
     * @param numero1 Primer número
     * @param numero2 Segundo número
     */
    public void ingresarNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /**
     * Calcula la suma de los dos números
     * @return resultado de la suma
     */
    public double sumar() {
        return numero1 + numero2;
    }

    /**
     * Calcula la resta de los dos números
     * @return resultado de la resta
     */
    public double restar() {
        return numero1 - numero2;
    }

    /**
     * Calcula la multiplicación de los dos números
     * @return resultado de la multiplicación
     */
    public double multiplicar() {
        return numero1 * numero2;
    }

    /**
     * Calcula la división de los dos números
     * Valida que el divisor no sea cero
     * @return resultado de la división
     */
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return numero1 / numero2;
    }

    /**
     * Método principal donde se ejecuta el menú interactivo
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            CalculadoraMatematica calculadora = new CalculadoraMatematica();
            
            int opcion;
            
            do {
                // Mostrar menú
                System.out.println("\n===== CALCULADORA MATEMÁTICA =====");
                System.out.println("1. Ingresar números");
                System.out.println("2. Sumar");
                System.out.println("3. Restar");
                System.out.println("4. Multiplicar");
                System.out.println("5. Dividir");
                System.out.println("0. Salir");
                System.out.println("==================================");
                System.out.print("Seleccione una opción: ");
                
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    
                    case 1 -> {
                        System.out.print("Ingrese el primer número: ");
                        double n1 = scanner.nextDouble();
                        
                        System.out.print("Ingrese el segundo número: ");
                        double n2 = scanner.nextDouble();
                        
                        calculadora.ingresarNumeros(n1, n2);
                        System.out.println("Números ingresados correctamente.");
                    }
                        
                    case 2 -> System.out.println("Resultado de la suma: " + calculadora.sumar());
                        
                    case 3 -> System.out.println("Resultado de la resta: " + calculadora.restar());
                        
                    case 4 -> System.out.println("Resultado de la multiplicación: " + calculadora.multiplicar());
                        
                    case 5 -> System.out.println("Resultado de la división: " + calculadora.dividir());
                        
                    case 0 -> System.out.println("¡Gracias por usar la calculadora!");
                        
                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                }
                
            } while (opcion != 0);
        }
    }
}
