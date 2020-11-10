/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercise5.pkg03;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3Exercise503 {

    public static int reverse(int number) {
        int sum = 0;
        int rem = 0;
        int n = number;

        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        return (int) sum;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        // Palindrome

        int value = 454;

        int reverse = reverse(value);

        System.out.println("value is " + value + " and reversed value is " + reverse);
        System.out.println("The value is palindrome? " + isPalindrome(value));

    }

}
