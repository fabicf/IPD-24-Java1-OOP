/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05prepquiz2randnumsmany;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day05PrepQuiz2RandNumsMany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ask user for minimum, maximum (inclusive) and how many (count) random numbers user wants to generate.
        Makes sure minimum is not larger than maximum and count is not negative.
        Display error message if inputs are invalid.
        If all is fine then generate the random numbers and print them out, comma-separated on a single line.
        Example session:
        Enter minumum: 5
        Enter maximum: 10
        How many to generate? 3
        Random numbers: 6, 9, 10
        */
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter minimum: ");
        int minimum = input.nextInt();
        
        System.out.println("Enter maximum: ");
        int maximum = input.nextInt();
        if (maximum < minimum){
            System.out.println("invalid input: maximum should be greater than minimum");
            System.exit(1);
        }
        
        System.out.println("How many to generate: ");
        int count = input.nextInt();
        if (count <= 0) {
            System.out.println("invalid input: How many to generate should be greater than 0");
            System.exit(1);
        }

        System.out.print("Random numebr: ");
        for (int i = 0; i < count; i++) {
            double random = (minimum) + Math.random() * ((maximum - minimum) + 1);
            System.out.print((int) random + ", ");
        }


        
        
        
        
        
    }
    
}
