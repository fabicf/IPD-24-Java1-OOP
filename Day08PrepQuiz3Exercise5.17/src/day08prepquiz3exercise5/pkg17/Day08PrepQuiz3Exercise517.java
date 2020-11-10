/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercise5.pkg17;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3Exercise517 {

    public static void printMatrix(int n) {

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int random = (int) (Math.floor((Math.random() * 2)));
                System.out.print(random + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // Array 2D - Creating a matrix

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);

    }

}
