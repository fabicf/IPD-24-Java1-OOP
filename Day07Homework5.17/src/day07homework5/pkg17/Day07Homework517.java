/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day07homework5.pkg17;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day07Homework517 {

    public static void printMatrix(int n) {
    int matrix[][] = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((int) Math.floor(Math.random() * 2));
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        // Display matrix of 0 and 1s
        // n = lines# x rows#

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
         
        printMatrix(n);

    }

}
