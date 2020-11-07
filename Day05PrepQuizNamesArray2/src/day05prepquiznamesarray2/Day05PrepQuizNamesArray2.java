/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05prepquiznamesarray2;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day05PrepQuizNamesArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Part 1
        
        Scanner input = new Scanner(System.in);        
        int[] valsArray = new int [4];
                
        for (int i = 0; i < valsArray.length; i++) {
            System.out.print("Enter a number: ");
            valsArray[i] = input.nextInt();
           
        }
        for (int i = 0; i <valsArray.length; i++) {
        System.out.printf("Value #%d is %d\n", i+1, valsArray[i]);
        }   
        
        int sum = 0;
        int smallest = valsArray[0];
        
        for (int i = 0; i < valsArray.length; i++) {
            
            sum = sum + valsArray
            
        }
        
             
        
        
        
        
        
    }
    
}
