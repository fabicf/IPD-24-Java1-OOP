/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework2.pkg23;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day03HomeWork223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // rite a program that receives an ASCII code (an integer between 0 and 127) and displays its character
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCC code: ");
        int asciiCode = input.nextInt();
        if (asciiCode < 0 || asciiCode > 127){
            System.out.println("Plese enter a number between 0 and 127");
            System.exit(1);
        }
        char asciiChar = (char)asciiCode;
        System.out.printf("The character is %c\n", asciiChar); 
        
    }
    
}
