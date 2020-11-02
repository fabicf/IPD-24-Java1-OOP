/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day02prepwquiz2_1;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day02PrepWQuiz2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Converting Celsius to Fahrenheit
        //Fahrenheit = (9/5) * celsius + 32
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        double celsius = input.nextDouble();
        double fahr = ((double)9/5) * celsius * 32;

        System.out.printf("%.2f celsius %.3f Fahrenheit\n", celsius, fahr);
        
    }
    
}
