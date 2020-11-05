/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day04homework4.pkg18;

/**
 *
 * @author 15144
 */
public class Day04HomeWork418 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Display four patterns using loops
        final int HEIGHT = 6;
        // Pattern A
        for (int i = 0; i <= HEIGHT; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", j);               
            }
            System.out.println();
        }
        //Pattern B
        System.out.println("====================");
        for (int i = HEIGHT; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);  
            }
            System.out.println();
        }
        // copiar pattern b versao 2
        
        
        
        //Patern C - 
        System.out.println("=============");
        for (int i = 1; i <= HEIGHT; i++) {
            //print space first (same as pattern b - versao 2)
            for (int j = 1; j <= HEIGHT - i; j++) {
                System.out.printf("__");
            }
            //print numbers
            for (int j = 1; j <= i; i++) {
                for (int k = 0; k < 10; k++) {
                    
                }
                
            }
            System.out.println();
        }
        
}
    
}

