/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01homework3.pkg6;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01HomeWork36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Health application: BMI
        // BMI = 703 * (pounds/in^2)
        
        //1. get the input
        Scanner input = new Scanner (System.in);
        System.out.println("Enter weight in pounds: ");
        int pounds = input.nextInt();
        
        System.out.println("Enter feet: ");
        int feet = input.nextInt();
                      
        System.out.println("Enter inches: ");
        int inches = input.nextInt();
        
        // convert foot in inches
        int feet1 = feet * 12;
        
        //sum all inches
        double totalInches = feet1 + inches;
        
        double bodyMassIndex = 703 * ( pounds / (totalInches * totalInches)) ;
        
        System.out.printf("BMI is %.2f\n", bodyMassIndex);
        
        if (bodyMassIndex < 19){
            System.out.println("Underweight");
        } else if (/* bodyMassIndex >= 19 && do not use*/ bodyMassIndex < 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Overweight");
        }
    }
    
}
