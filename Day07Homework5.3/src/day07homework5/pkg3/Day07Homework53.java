/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day07homework5.pkg3;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day07Homework53 {

    public static int reverse(int value){
    int sum = 0;
    int rem = 0;
    int n = value;

        while (n > 0) {
            rem = n % 10;
            sum = (sum*10) + rem;
            n = n / 10;

        }
        return (int) sum;
    
    }
    
    public static boolean isPalindrome(int value){
        return (value == reverse(value));
    }
    
    public static void main(String[] args) {
        // palindrome
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int value = input.nextInt();
        
        int reverse = reverse(value);
        System.out.printf("value %d reversed is %d\n", value, reverse);
        System.out.println("Is value a palindrome? " + isPalindrome(value));
        
        
        
        
    }
    
}
