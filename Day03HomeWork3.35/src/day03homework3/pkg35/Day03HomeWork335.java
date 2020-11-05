/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework3.pkg35;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day03HomeWork335 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Convert decimal to hexadecimal
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15): ");
        int enteredValue = input.nextInt();
        
        if (enteredValue > 15){
            System.out.println("Invalid Input");
            System.exit(1);
        }
               
        //System.out.println(Integer.toHexString(enteredValue)); 
        
        char c;
        if (enteredValue <= 9) {
            c = (char) ('0' + enteredValue);
        } else{
            c = (char)('A' + enteredValue - 10);
        }
        
        System.out.println("Hexadecimal: " + c);
    }
    
}
