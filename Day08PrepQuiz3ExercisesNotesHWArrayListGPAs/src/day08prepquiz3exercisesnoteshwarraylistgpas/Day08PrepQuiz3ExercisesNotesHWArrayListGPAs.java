/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercisesnoteshwarraylistgpas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3ExercisesNotesHWArrayListGPAs {

    static double letterGradetoNum(String letterGrade) {
        double gpaValue;
        switch (letterGrade) {
            case "A+":
                gpaValue = 4.33;
                break;
            case "A":
                gpaValue = 4.00;
                break;
            case "A-":
                gpaValue = 3.67;
                break;
            case "B+":
                gpaValue = 3.33;
                break;
            case "B":
                gpaValue = 3.00;
                break;
            case "B-":
                gpaValue = 2.67;
                break;
            case "C+":
                gpaValue = 2.33;
                break;
            case "C":
                gpaValue = 2.00;
                break;
            case "C-":
                gpaValue = 1.67;
                break;
            case "D":
                gpaValue = 1.00;
                break;
            case "F":
                gpaValue = 0;
                break;
            default:
                gpaValue = -1;
        }
        return gpaValue;

    }

    public static void main(String[] args) {
        /*
        Keep asking user for a letter grade until user enters an empty string.
        Store all grades in ArrayList.
        Display all grades letter and numerical (GPA), one pair per line.

        Use the following method to convert grade letter to numerical GPA grade.

        static double letterGradeToNum(String letterGrade) { ... }

        if letter grade is not valid then the method will return -1.

        Compute the average GPA of all grades.
        Find and display the highest and lowest grade.
        Find and display how many highest and lowest grades were entered.


        Suggestion: you could create another ArrayList<Double> to store converted GPA values and perform computations on those values.
         */

        Scanner input = new Scanner(System.in);

        ArrayList<String> allGrades = new ArrayList<String>();

        //enter grades in string
        while (true) {
            System.out.println("Enter letter grade, empty to exit: ");
            String gradeEntered = input.nextLine();

            if (gradeEntered.isEmpty()) {
                break;
            }

            //add grades entered in allGrades Arraylist
            allGrades.add(gradeEntered.toUpperCase());
        }

        //print Array List with values entered
        System.out.println(allGrades);;

        //display pair (grade letter = value)
        for (int i = 0; i < allGrades.size(); i++) {
            System.out.println(allGrades.get(i) + " = " + letterGradetoNum(allGrades.get(i)));

        }

        //create arraylist with int values:
        ArrayList<Double> gpaValues = new ArrayList<Double>(allGrades.size() + 1);

        for (int i = 0; i < allGrades.size(); i++) {
            gpaValues.add(letterGradetoNum(allGrades.get(i)));
        }
        //print the converted allGrades to gpaValues
        System.out.println(gpaValues);
        System.out.println("size is" + gpaValues.size());

        //highest and lowest
        int count = 0;
        double sum = 0;
        double highest = 0;
        double lowest = 5.0;
        for (int i = 0; i < gpaValues.size(); i++) {
            sum = sum + gpaValues.get(i);
            count++;
            if (gpaValues.get(i) > highest) {
                highest = gpaValues.get(i);
            }

            if (gpaValues.get(i) < lowest) {
                lowest = gpaValues.get(i);
            }
        }

        //how many higheste how many lowest
        int lowestTimes = 0;
        int highestTimes = 0;
        for (int i = 0; i < gpaValues.size(); i++) {
            if (gpaValues.get(i) == lowest){
                lowestTimes++;
            }
            if (gpaValues.get(i) == highest){
                highestTimes++;
            }

        }

        //average
        double avg = sum / count;
        System.out.println("The total sum is: " + sum + " and average is " + avg);
        System.out.println("lowest value is: " + lowest + " displayed " + lowestTimes + " times");
        System.out.println("highest value is: " + highest + " displayed " + highestTimes + " times");

    }

}
