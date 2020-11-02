/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01homework2.pkg17;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01HomeWork217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Science: Wind-chill temperature
        
        // 1. get the input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double outTemp = input.nextDouble();
        
        // 2. verification       
        if (outTemp < -58 || outTemp > 41) {
            System.out.println("Error: temperature must be between -58 and 41 F");
            System.exit(1);
        }
        
        // 1. get the input
        System.out.println("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();
        
        // 2. verification
        if (windSpeed < 2){
            System.out.println("Error: Wind Speed must be greater or equal 2");
            System.exit(1);}
        
        
        // 3. do the work
        double tempWindChill = 35.74 + (0.6215*outTemp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * outTemp * Math.pow(windSpeed, 0.16));
                                
        System.out.printf("The wind chill index is: %.5f\n", tempWindChill);
    }
    
}
