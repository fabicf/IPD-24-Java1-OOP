/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework3.pkg16;

/**
 *
 * @author 15144
 */
public class Day03HomeWork316 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // (Random Character) Write a program  that displays a random uppercase letter using the Math.random() method
        int rand = 65 + (int) (Math.random() * ((90 - 65) + 1));
        char randUppercase = (char) rand;
 
        System.out.println("The random number is " + rand + " and the random uppercase is " + randUppercase);
    }
    
}
