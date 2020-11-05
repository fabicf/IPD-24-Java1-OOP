/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day04homework6.pkg2;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day04HomeWork62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Reverse the numbers entered
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String entValues = input.nextLine();
        String[] splitStr = entValues.split("\\s+");

        int size = splitStr.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(splitStr[i]);
        }
        
        for (int i = size - 1; i >= 0; i--){
        
        System.out.print(arr[i]);
        }
    }
    
}
