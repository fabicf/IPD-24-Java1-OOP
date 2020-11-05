/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05homework5.pkg8;

/**
 *
 * @author 15144
 */
public class Day05HomeWork58 {
    
    public static double celsiusToFarehrenheit (double celsius){
        return 9.0/5 * celsius + 32;
    }
    
    public static double fahrenheitToCelsius (double fahrenheit){
        return 5.0/9 * (fahrenheit -32);
    }
    
    public static void main(String[] args) {
        // C to F table
        double celsius = 40;
        double fahrenheit = 120;
        System.out.println("Celsius   Fahrenheit   |  Fahrenheit  Celsius");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double fahFromCel = celsiusToFarehrenheit(celsius);
            double celFromFah = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.1f         %5.1f         %5.1f         %5.2f\n", celsius, fahFromCel, fahrenheit, celFromFah);
            celsius -= 1;
            fahrenheit = 10;
        }
    }
    
}
