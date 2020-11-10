/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercisesnoteshwarray2d;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3ExercisesNotesHWArray2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declare two-dimensional array 3 rows by 4 columns of integers.
        Initialize the array with integers in 0-100 range using = {} syntax.

        Display rows/columns values comma separated, one row per line.
        Compute and display the sum of all values.
        Comptue and display the average of all values (floating point).
        Compute and display the largest value.

        LATER:
        Modify the program so that instead of predefined set of values in the array your program assings random values in 0-100 range to the array cells.
         */
        
        int myArray[][] = {{1, 2, 3, 4}, {5, 6, 7, 8,}, {9, 10, 11, 12}};
        
        int sum = 0;
        int count = 0;
        int largest = myArray[0][0];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
                sum = sum + myArray[i][j];
                count++;
                if(myArray[i][j] > largest){
                    largest = myArray[i][j];
                }
            }
            System.out.println();
        }
        
        int avg = sum / count;
        
        System.out.println("sum of all values is: " + sum);
        System.out.println("average of values if: " + avg);
        System.out.println("largest value is: " + largest);
        
    }
    
}
