/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercise6.pkg08a;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3Exercise608a {

    public static int average(int[] array){
        int sum = 0;
        for (int item : array){
            sum = sum + item;
        }
        return sum / array.length;
    }
    
    
    public static double average(double[] array){
        double sum = 0;
        for (double item : array){
            sum = sum + item;
        }
    
        return sum / array.length;
    }
    
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {2.2, 3.2, 3.3};

        int avgInt = average(intArray);
        double avgDouble = average(doubleArray);

        System.out.println("average int is: " + avgInt);
        System.out.println("average double is: " + avgDouble);

    }
    
}
