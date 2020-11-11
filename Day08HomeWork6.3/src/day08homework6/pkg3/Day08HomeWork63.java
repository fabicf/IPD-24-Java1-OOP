/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08homework6.pkg3;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day08HomeWork63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask user for a number n, must be 0-100,
        //increment frequences[n] value
        //keep repeating unitl user enters 0,
        //after that go over frequencies array, find all non-zero values and display them

        int[] frequences = new int[101];
        
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the integers between 1 and 100, 0 to stop: ");
            int value = input.nextInt();
            if (value == 0) {
                break;
            }
            //adding values to frequence array:
            frequences[value] = frequences[value] + 1;
            
        }
            for (int i = 0; i < frequences.length; i++) {
                int count = frequences[i];
                if (count == 0){
                continue;}
                
                    System.out.println("number" + i + " was entered " + count + " times");        
                }
                    
            }
// to be finished
        
    

}
