/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework2.pkg13loop;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day03HomeWork213Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // // Financial Application: compound value
        // Monthly Interest Rate = MR = 0.00417 = (1 * 0.00417) (fix)
        // Monthly Savings = MS = e.g. 100$
        // Final value = 6th month
        
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        double interestRate = 1 + 0.00417;
        double finalValue = 0;
        int i;
        
        for (i = 0; i < 6; i++){
          finalValue = (monthlySaving + finalValue)* interestRate;
        }
        
        System.out.printf("After the sixth month, the account value is $ %.2f\n", finalValue);


    }
    
}
