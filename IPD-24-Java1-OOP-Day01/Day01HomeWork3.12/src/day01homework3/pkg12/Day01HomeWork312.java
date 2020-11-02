/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01homework3.pkg12;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01HomeWork312 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Check a number
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer");
        
        int value = input.nextInt();
        
        if ((value % 5 == 0 || value % 6 == 0) && (value % 5 != 0 && value % 6 != 0)) {
            System.out.println( value + " is divisible by 5 or 6, but not both");
        }
        else if (value % 5 == 0 && value % 6 == 0){
            System.out.println(value + " is divisible by both 5 and 6");
        }
        else{
            System.out.println(value + " is not divisible by either 5  or 6");
        }
            
              
        }
    
}
