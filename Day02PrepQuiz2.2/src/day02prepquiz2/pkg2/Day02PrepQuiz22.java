/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day02prepquiz2.pkg2;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day02PrepQuiz22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Compute the area and the volume of a cilinder
        //area = radius * radius * p
        //volume = area * lenght 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cilinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter the lenght of the cilinder: ");
        double lenght = input.nextDouble();
        
        double area = radius * radius * 3.14159;
        double volume = area * lenght;
        
        System.out.printf("The area is %.3f and the volume is %.2f\n", area, volume);
        
        
        
        
    }
    
}
