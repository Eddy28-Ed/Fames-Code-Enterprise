/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author User
 */
public class ConversorTemperatura {
    
    public double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
