/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day04homework4.pkg41;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day04HomeWork441 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ocorrence of max numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String entValues = input.nextLine();
        String[] splitStr = entValues.split("\\s+");

        int size = splitStr.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(splitStr[i]);
        }
        
        int max = 0;
        int count = 1;
        for (int i = 0; i < size; i++){
                       
            if (arr[i] > max){
                max = arr[i];
                count = 0;
            }
            if (arr[i] == max){
                count++;     
            }       
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The occurence of the largest number is: " + count);
    }
    
}
