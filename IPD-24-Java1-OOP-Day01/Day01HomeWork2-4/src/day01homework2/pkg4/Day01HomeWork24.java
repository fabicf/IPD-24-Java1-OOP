/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01homework2.pkg4;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01HomeWork24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Converting pounds into kilograms - kg = pounds * 0.454
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        //System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        System.out.printf("%.3f pounds is %.3f kilograms\n", pounds, kilograms);
        
    }
    
}
