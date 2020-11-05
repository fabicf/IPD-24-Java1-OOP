/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day04homework4.pkg01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day04HomeWork401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Count positive and negative numbers and compute the average of numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String entValues = input.nextLine();
        String[] splitStr = entValues.split("\\s+");

        int size = splitStr.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(splitStr[i]);
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int totalSum = 0;
        double average = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            }
            if (arr[i] < 0) {
                negativeCount++;
            }
            totalSum = totalSum + arr[i];
        }
        average = (double) totalSum / size;
        System.out.println("The number of positives is: " + positiveCount);
        System.out.println("The number of negatives is: " + negativeCount);
        System.out.println("The total is: " + totalSum);
        System.out.println("The average is: " + average);
    }
}
