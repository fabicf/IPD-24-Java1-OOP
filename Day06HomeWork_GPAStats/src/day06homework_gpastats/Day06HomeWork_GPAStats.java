/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day06homework_gpastats;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day06HomeWork_GPAStats {

    public static double letterGradeToNum(String letterGrade) {

        double gpaNumber = 0;
        switch (letterGrade) {
            case "A+":
                gpaNumber = 4.33;
                break;
            case "A":
                gpaNumber = 4.0;
                break;
            case "A-":
                gpaNumber = 3.67;
                break;
            case "B+":
                gpaNumber = 3.33;
                break;
            case "B":
                gpaNumber = 3.0;
                break;
            case "B-":
                gpaNumber = 2.67;
                break;
            case "C+":
                gpaNumber = 2.33;
                break;
            case "C":
                gpaNumber = 2.0;
                break;
            case "C-":
                gpaNumber = 1.67;
                break;
            case "D":
                gpaNumber = 1.0;
                break;
            case "F":
                gpaNumber = 0;
                break;
            default:
                gpaNumber = -1;

        }
        return gpaNumber;

    }

    public static void main(String[] args) {
        // 
        ArrayList<String> gpa = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        String enteredGpa = "";
        while (true) {
            System.out.println("Enter a letter grade, empty to finish entering: ");
            enteredGpa = input.nextLine();
            if (enteredGpa.isEmpty()) {
                break;
            }
            gpa.add(enteredGpa.toUpperCase());
        }

        System.out.println(gpa);

        for (int i = 0; i < gpa.size(); i++) {
            System.out.println(gpa.get(i) + " = " + letterGradeToNum(gpa.get(i)));

        }

        //array list to store converted gpa values:
        ArrayList<Double> convertedGpa = new ArrayList(gpa.size() + 1);

        for (int i = 0; i < gpa.size(); i++) {
            convertedGpa.add(letterGradeToNum(gpa.get(i)));

        }
        System.out.println(convertedGpa);

        //finding highest grade
        double highestGrade = 0;
        for (int i = 0; i < convertedGpa.size(); i++) {
            if (convertedGpa.get(i) > highestGrade) {
                highestGrade = convertedGpa.get(i);
            }
        }
        //finding lowest grade
        double lowestGrade = 5.0;
        for (int i = 0; i < convertedGpa.size(); i++) {
            if (convertedGpa.get(i) < lowestGrade) {
                lowestGrade = convertedGpa.get(i);
            }
        }
        System.out.println(highestGrade);
        System.out.println(lowestGrade);
        
        //finding highest grade count
        int highestGradeCount = 0;
        for (int i = 0; i < convertedGpa.size(); i++) {
            if (convertedGpa.get(i) == highestGrade){
                highestGradeCount++;
            }   
        }
        System.out.println("The number of the highest grade is: " + highestGradeCount);
            
        //finding lowest grade count
        int lowestGradeCount = 0;
        for (int i = 0; i < convertedGpa.size(); i++) {
            if (convertedGpa.get(i) == lowestGrade){
                lowestGradeCount++;
            }   
        }
        System.out.println("The number of the lowest grade is: " + lowestGradeCount);

    }
}
