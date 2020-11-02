/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01who;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01Who {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. get the input
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("How tall are you, in meters?");
        double heightMeters = input.nextDouble();
        
        // 2. verification
        if (name.equals ("")){
            System.out.println("Error: anem must not be empty");
            System.exit(1); // only this course, normally reserved for fatal errors
        }
        if (age <0 || age > 150){
            System.out.println("Error: age must be between 0-150");
            System.exit(1);
        }
        if (heightMeters < 0 || heightMeters > 3) {
            System.out.println("Error: height must be between 0 - 3m");
            System.exit(1);
        }
        // 3. do the work
        System.out.println("Nice to meet you " + name + ", you are " + age + " years old and " + heightMeters + "m tall");
        //
        if (age >= 18){
            System.out.println("You are an adult");
        } else {
            System.out.println("Grow up!");
        }
        
        System.out.println("Done");
    }
    
}
