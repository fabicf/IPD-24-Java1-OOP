/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day04homeworkinvoketest;

/**
 *
 * @author 15144
 */
public class Day04HomeWorkInvokeTest {
    
    
    
    public static int sum(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i<=i2; i++)
            sum = sum + i;
        return sum;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 5 is: " + sum(1,5));
        System.out.println("Sum from 1 to 5 is: " + sum(1,10));

    }
    
}
