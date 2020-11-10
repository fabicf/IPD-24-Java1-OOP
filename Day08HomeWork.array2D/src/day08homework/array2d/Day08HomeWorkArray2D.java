/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08homework.array2d;

/**
 *
 * @author 15144
 */
public class Day08HomeWorkArray2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create array 3x4, display, sum all values, average, largest values

        //int[][] myArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] myArray = new int [3][4];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = ((int) (Math.random() * 101));
                System.out.print(myArray[i][j] + ", ");
            }
            System.out.println();
        }

        //sum
        int sum = 0;
        int count = 0;
        int largest = myArray[0][0];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum = sum + myArray[i][j];
                count++;
                if (myArray[i][j] > largest) {
                    largest = myArray[i][j];
                }
            }
        }
        
        double average = sum / count;
        System.out.println("total sum is: " + sum);
        System.out.println("average is: " + average);
        System.out.println("largest value is: " + largest);
    }

}
