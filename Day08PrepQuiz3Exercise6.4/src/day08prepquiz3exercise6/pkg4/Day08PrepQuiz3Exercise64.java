/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercise6.pkg4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3Exercise64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Use ArrayList
        //1. Scanner, negative to stop, max = 100 while loop;
        //2. Add input scores to arraylist;
        //3. average (you need find the sum / arraylist size) --> use for to find sum;
        //4. above or equal average (for loop to check each one)
        //5. below average for loop to check each one

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();

        while (true) {
            System.out.println("Enter score, negative to stop: ");
            int value = input.nextInt();
            if (value < 0) {
                break;
            }
            scores.add(value);
        }

        //sum and avg
        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum = sum + scores.get(i);
        }
        double avg = (double)sum / scores.size();

        //above or equal
        int countAbove = 0;
        int countBelow = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) >= avg) {
                countAbove++;
            }
            if (scores.get(i) < avg) {
                countBelow++;
            }

        }

        System.out.println(scores);
        System.out.println("sum is " + sum + " and average is " + avg);
        System.out.println("The numbers of scores above or equal average is: " + countAbove);
        System.out.println("The numbers of scores below average is: " + countBelow);

    }

}
