/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercise6.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3Exercise62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Reverse the numbers entered = 10 integers
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true) {
            System.out.println("Enter values, 0 to stop: ");
            int value = input.nextInt();
            if (value == 0) {
                break;
            }

            numbers.add(value);
        }
        System.out.println(numbers);
        
        ArrayList<Integer> reversed = new ArrayList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
            reversed.add(numbers.get(i));
        }
        System.out.println(reversed);
        
        /*
        for (int i : reversed){
            System.out.println(i);
        }*/
    }

}
