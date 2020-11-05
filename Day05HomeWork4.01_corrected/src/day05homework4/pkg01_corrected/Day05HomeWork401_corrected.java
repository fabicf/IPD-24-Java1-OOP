/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05homework4.pkg01_corrected;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day05HomeWork401_corrected {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Add variables for statitics here
        int countNegative = 0;
        int countPositive = 0;
        int totalSum = 0;
        double average = 0;
        int num = 0;
        while (true){
            System.out.println("Enter an integer, 0 to end input: ");
            int value = input.nextInt();
            if (value == 0){
                break;
            }
            //complete statistics here
            if (value < 0){
            countNegative++;
            }
            
            if (value > 0){
            countPositive++;
            }
            num++;
            totalSum = totalSum + num;
        }
        average = (double) totalSum / num;
        //display statistics here
        System.out.println("The number of negatives is: " + countNegative);
        System.out.println("The number of positive is: " + countPositive);
        System.out.println("The total is: " + totalSum);
        System.out.println("The average is: " + average);
        System.out.println("Done. ");
    }
    
}
