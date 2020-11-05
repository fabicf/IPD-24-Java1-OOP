/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework4.pkg5;

/**
 *
 * @author 15144
 */
public class Day03HomeWork45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Table - Convert kilograms to pound and pounds to kg
        int kg;
        int pounds2 = 20;
        
        
        
        
        System.out.println("kilograms \t pounds \t | \t pounds \t \t kilograms");
        for (kg =1; kg < 200; kg += 2){
            double pounds = kg * 2.2;
            double kg2 = pounds2 * 0.453;
            System.out.printf("%d \t \t %.1f \t | \t %d \t \t %.2f\n",kg, pounds, pounds2, kg2);
            pounds2 += 5;
            
            
        
        }
        
    }
    
}
