/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05homework4.pkg8;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day05HomeWork48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        System.out.println("How many students? ");
        int count = input.nextInt();
        input.nextLine(); //consume the left over newline character
        //count mus be non-negative
        int bestScore = -1;
        String studentWithBestScore = "";
        for (int i = 0; i < count; i++) {
            System.out.println("Enter student's name: ");
            String name = input.nextLine();
            System.out.println("Enter student's score 0-100: ");
            int scorePerc = input.nextInt();
            input.nextLine(); //consume the left over newline character
            if (scorePerc > bestScore){
                bestScore = scorePerc;
                studentWithBestScore = name;
            }
        }
        System.out.printf("Student %s has the best score %d\n", studentWithBestScore, bestScore);
    }
    
}
