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
    
    
    
    public static double DoubleX(double x) {
        double result = x * 2;
        return result;
    }
    
    
    
    public static void main(String[] args) {
        double value = DoubleX(2.0);
        System.out.println(value);
        System.out.println(DoubleX(12.0));
    }
    
}
