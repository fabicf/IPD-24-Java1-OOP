/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08homework6.pkg4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class DAy08HomeWork64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //arrayList scores
        //ask for score input (max input 100)
        //negative number to end score input
        //store the input scores on array
        //find the average os scores
        //determine how many scores are above/equal/belowthe average

        ArrayList<Integer> scores = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        // asking inpu and storing values in arraylist
        while (true) {
            System.out.println("Enter score 1-100, negative to finish: ");
            int n = input.nextInt();
            if (n < 0) {
                break;
            }
            scores.add(n); //add/store values on scores arraylist
        }
        
        // sum (to be able to find average)
        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum = sum + scores.get(i);
        }
        
        //average
        int avg = sum / scores.size();
        
        //scores equal avergae
        int countAvg = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) == avg){
                countAvg++;
            }    
        }
        
        //countAbove = 0;
        int countAbove = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > avg){
                countAbove++;
            }    
        }
        
        //cout below
        int countBelow = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < avg){
                countBelow++;
            }    
        }
        
      
        System.out.println(scores);
        System.out.println(avg);
        System.out.println("avg is " + avg + ". scores equal average is " + countAvg);
        System.out.println("avg is " + avg + ". scores above average is " + countAbove);
        System.out.println("avg is " + avg + ". scores below average is " + countBelow);

    }

}
