/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01compute;

/**
 *
 * @author 15144
 */
public class Day01Compute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //main method
        double radius;
        double area;
        
        //assign a radius
        radius = 20;
        
        //compute area
        area = radius * radius * 3.14159;
        
        //display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
        
    }
    
}
