/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day04homework4.pkg17;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day04HomeWork417 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Display pyramid
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of lines: ");
        int linesNum = input.nextInt();
        //display pyramid
        for (int rowsNum = 1; rowsNum <= linesNum; rowsNum++){
            //spaces in each row
            for (int spaces = linesNum - rowsNum; spaces >= 1; spaces--){
                System.out.print("  ");
            }
            //descending number in each row
            for (int desc = rowsNum; desc >= 2; desc--){
                System.out.print(desc + " ");
            }
            
            //ascending number in each row
            for (int asc = 1; asc <= rowsNum; asc++){
                System.out.print(asc + " ");
            }
            
            //end of line
            System.out.println();
        }
        
        
        
        
    }
    
}
