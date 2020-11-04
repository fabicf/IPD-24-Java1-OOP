/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework3.pkg4;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day03HomeWork34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Game: learn addition - Write a program that generates two integers under 100 
        // and prompts the user to enter the sum of these two integers. The program then
        // reports true if the answer is correct, false otherwise. 
        Scanner input = new Scanner(System.in);
        int rand1 = (int)(Math.random()* 100);
        int rand2 = (int)(Math.random()* 100);
        boolean check;
        System.out.println("Please enter the sum of " + rand1 + " and " + rand2);
        int sumResult = input.nextInt();
        
        if (sumResult == (rand1 + rand2)){
            check = true;
        } else {
            check = false;
        }
        System.out.println(check);
        
    }
    
}
