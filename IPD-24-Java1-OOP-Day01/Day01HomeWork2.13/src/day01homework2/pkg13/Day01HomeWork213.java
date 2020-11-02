/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01homework2.pkg13;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01HomeWork213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Financial Application: compound value
        // Monthly Interest Rate = MR = 0.00417 = (1 * 0.00417) (fix)
        // Monthly Savings = MS = e.g. 100$
        // Final value = 6th month
        
        //firstMonth = Monthly Savings * (1 + 0.00417) 
        //firstMonth = MS * MR
        //secondMonth = (MS + firstMonth) * MR
        //thirdMonth = (MS + secondMonth) * MR ...
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        double interestRate = 1 + 0.00417;
        double month1 = monthlySaving * interestRate;
        double month2 = (month1 + monthlySaving) * interestRate;
        double month3 = (month2 + monthlySaving) * interestRate;
        double month4 = (month3 + monthlySaving) * interestRate;
        double month5 = (month4 + monthlySaving) * interestRate;
        double month6 = (month5 + monthlySaving) * interestRate;
        
        DecimalFormat df = new DecimalFormat("####0.00"); //formated 2 decimals for cents
        
        System.out.println("After the sixth month, the account value is $" +  
                df.format(month6));
             
    }
    
}
