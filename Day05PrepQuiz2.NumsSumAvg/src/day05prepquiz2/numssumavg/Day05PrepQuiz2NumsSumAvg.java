/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05prepquiz2.numssumavg;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day05PrepQuiz2NumsSumAvg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* keep asking user for an integer number until user enters 0 (sentinel value)
        while numbers are being entered compute the sum of all numbers
        once the loop is done display the sum and average of all numbers
        Example session:
        Enter a number, 0 to exit: 3
        Enter a number, 0 to exit: 2
        Enter a number, 0 to exit: 5
        Enter a number, 0 to exit: 0
        Sum is 10
        Average is 3.333 */
        
        //scanner
        Scanner input = new Scanner(System.in);
        
             
        int sum = 0;
        int count = 0;
        while (true){
            // input for entered values
            System.out.println("Enter an integer. Enter zero to stop");
            int valueEntered = input.nextInt();
            // zero to exit
            if (valueEntered == 0){
                break;        
            }
            count++;
            
            // sum
            sum = sum + valueEntered;
        }         
        System.out.println("The sum is: " + sum);
        System.out.printf("The average is %.2f\n", (double) sum / count);
        
    }

}
