/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05homework6.pkg1;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day05Homework61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Assign grades
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int studNum = input.nextInt();
        //todo: check count is > 0
        
        int []scoresArray = new int [count];        
        for (int i = 0; i < count; i++) {
            System.out.printf("Enter score %d, should be 0-100: ", i+1);
            int score = input.nextInt();
            //todo: checkk score is 0-100
        }
        
        //find max value
        int maxScore = scoresArray[0];
        for (int i = 0; i < count; i++) {
            int score = scoresArray[i]
            if (score > maxScore){
            maxScore = score
            }
        }
        
        //
        for (int i = 0; i < count; i++) {
        int score = scoreArray[i];
        if score 
        }
        System.out.println(sc1+ "," + sc2);

    }
    
}
