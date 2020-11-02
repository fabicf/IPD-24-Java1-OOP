/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01homehork2.pkg3;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01HomeHork23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // converting feet into meters --> 1 foot = m/0.305 --> m = ft x 0.305
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;        
        // System.out.println(feet + " feet is " + meters + " meters" );
        System.out.printf("%.3f feet is %.3f meters\n", feet, meters);
              
        
    }
    
}
