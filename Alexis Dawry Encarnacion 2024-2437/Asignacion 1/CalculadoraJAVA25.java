/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorajava25;

/**
 *
 * @author DAWRY13
 */

import java.util.Scanner;

public class CalculadoraJAVA25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int a = 0;
        int b = 0;

        while (menu != 6) {
            System.out.println("---- Calculadora JAVA ----");
            System.out.println("1. Ingresar valores (a y b)");
            System.out.println("2. Suma");
            System.out.println("3. Resta");
            System.out.println("4. Multiplicación");
            System.out.println("5. División");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            menu = sc.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("Ingresar valor [a]: ");
                    a = sc.nextInt();
                    System.out.print("Ingresar valor [b]: ");
                    b = sc.nextInt();
                }

                case 2 -> System.out.println("Resultado: " + suma(a, b));

                case 3 -> System.out.println("Resultado: " + resta(a, b));

                case 4 -> System.out.println("Resultado: " + multiplicacion(a, b));

                case 5 -> {
                    if (b != 0) {
                        System.out.println("Resultado: " + division(a, b));
                    } else {
                        System.out.println("Error: no se puede dividir entre 0");
                    }
                }

                case 6 -> System.out.println("Salir del programa...");

                default -> System.out.println("Opción inválida");
            }
            System.out.println();
        }

        sc.close();
    }

    public static float suma(int a, int b) {
        return a + b;
    }

    public static float resta(int a, int b) {
        return a - b;
    }

    public static float multiplicacion(int a, int b) {
        return a * b;
    }

    public static float division(int a, int b) {
        return (float) a / b;
    }
}
