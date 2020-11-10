/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08homework6.pkg2corrected;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day08HomeWork62corrected {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList <Integer> intList = new ArrayList <>();
        
        //int value = 0;
        while (true){
            System.out.println("Enter an Integer, 0 to finish: ");
            int value = input.nextInt();
            if (value == 0){
            break;
            }
            
            intList.add(value);
            
        }
        for (int i = 0; i < intList.size(); i++) {
            int n = intList.get(i);
            System.out.println("n = " + n);
        }
        for (int i = intList.size() - 1; i >= 0; i--) {
            int n = intList.get(i);
            System.out.println("n = " + n);
        }
        
        
    }
    
}
