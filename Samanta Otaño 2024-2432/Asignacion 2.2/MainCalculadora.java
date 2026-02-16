package holamundo;

class MainCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // ===== 2 PARÁMETROS =====
        System.out.println("Suma (2 params): " + calc.sumar(5, 3));
        System.out.println("Resta (2 params): " + calc.restar(10, 4));
        System.out.println("Multiplicación (2 params): " + calc.multiplicar(6, 7));
        System.out.println("División (2 params): " + calc.dividir(20, 4));

        System.out.println();

        // ===== 3 PARÁMETROS =====
        System.out.println("Suma (3 params): " + calc.sumar(5, 3, 2));
        System.out.println("Resta (3 params): " + calc.restar(10, 4, 2));
        System.out.println("Multiplicación (3 params): " + calc.multiplicar(2, 3, 4));

        System.out.println();

        // ===== 4 PARÁMETROS =====
        System.out.println("Suma (4 params): " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resta (4 params): " + calc.restar(20, 5, 3, 2));
        System.out.println("Multiplicación (4 params): " + calc.multiplicar(2, 2, 2, 2));
    }
}
