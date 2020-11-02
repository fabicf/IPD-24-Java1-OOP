/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01homework2.pkg7;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01HomeWork27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Findig the number of years
        //1 day = 1440 minute
        //1 year = 365 days = 525600 minutes
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        int remMin = minutes % 525600; 
        int days = remMin / 1440;
        //System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        System.out.printf(" %d minutes is approximatelly %d years and %d days\n", minutes, years, days);        
        
    }
    
}
