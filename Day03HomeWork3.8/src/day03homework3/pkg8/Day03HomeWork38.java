/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework3.pkg8;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day03HomeWork38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* (Sort three integers)
        n1 n2 n3
        n1 n3 n2
        n2 n1 n3
        n2 n3 n1
        n3 n2 n1
        n3 n1 n2
        */        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        if ((num1 <= num2) &&  (num2 <= num3)) {
            System.out.printf("%d <= %d <= %d\n", num1, num2, num3);
        } else if ((num1 <= num3) && (num3 <= num2)){
            System.out.printf("%d <= %d <= %d\n", num1, num3, num2);
        } else if ((num2 <= num1) && (num1 <= num3)){
            System.out.printf("%d <= %d <= %d\n", num2, num1, num3);
        } else if ((num2 <= num3) && (num3 <= num1)){
            System.out.printf("%d <= %d <= %d\n", num2, num3, num1);
        } else if ((num3 <= num2) && (num2 <= num1)){
            System.out.printf("%d <= %d <= %d\n", num3, num2, num1);
        } else if ((num3 <= num1) && (num1 <= num2)){
            System.out.printf("%d <= %d <= %d\n", num3, num1, num2);
        }
        
    }
    
}
