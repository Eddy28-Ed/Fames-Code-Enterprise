/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

public class Ejercicio5_SumatoriaDoWhile {
    public static void main(String[] args) {

        int suma = 0;
        int num = 1;

        do {
            suma += num;
            num++;
        } while (num <= 50);

        System.out.println("La sumatoria del 1 al 50 es: " + suma);
    }
}
