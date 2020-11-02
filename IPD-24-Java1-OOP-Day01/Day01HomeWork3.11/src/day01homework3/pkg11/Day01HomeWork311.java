/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01homework3.pkg11;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day01HomeWork311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Find the days# in a month
        //31 days months = January, March, May, July, August, October, December = 01, 03, 05, 07, 08, 10, 12
        //30 days months = April, June, September, November = 04, 06, 09, 11
        //28 days month = February = 02
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month#: ");
        int monthNumber = input.nextInt();
        
        if (monthNumber <= 0 || monthNumber > 12){
            System.out.println("Error: please enter a number for month between 1 and 12.");
            System.exit(1);
        }
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        
        if (year < 1582){
            System.out.println("Error: please enter year from 1582.");
            System.exit(1);
        }
        
        String monthName = null;
        int days = 0;
                  
               
        switch (monthNumber){
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2: 
                monthName = "February";
                if (year % 4 == 0){
                    days = 29;
                } else {        
                    days = 28;
                }
                
                break;   
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4: 
                monthName = "April";
                days = 30;
                break; 
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6: 
                monthName = "June";
                days = 30;
                break; 
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8: 
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10: 
                monthName = "October";
                days = 31;
                break; 
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12: 
                monthName = "December";
                days = 31;
                break;
        }
        
               
        
        System.out.println(monthName + " " + year + " had " + days + " days");
    }
    
}
