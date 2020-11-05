/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework4.pkg3;

/**
 *
 * @author 15144
 */
public class Day03HomeWork43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Table - Convert kilograms to pound
        int kg;
        
        
        System.out.println("kilograms      pounds");
        for (kg =1; kg < 200; kg += 2){
        double pounds = kg * 2.2;
        System.out.printf("%-3d            %5.1f\n",kg, pounds);
    }
        
        
    }
    
}
