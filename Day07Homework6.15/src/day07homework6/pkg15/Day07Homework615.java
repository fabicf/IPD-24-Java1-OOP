/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day07homework6.pkg15;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day07Homework615 {

     public static int[] eliminateDuplicate(int[] numbersArray){
         int uniqArray[] = new int[numbersArray.length];
         int uniqCount = 0;
         
         //take a look at each value from intArray
         for (int i = 0; i < numbersArray.length; i++) {
             int value = numbersArray[i];
             //does this value occur in uniqArray? only check the first uniqCount items
             boolean isDuplicate = false;
             for (int j = 0; j < uniqCount; j++) {
                 if (value == uniqArray[j]){
                     isDuplicate = true;
                     break;
                 }
             }
             
             //the flag will tell us what to do
             if(!isDuplicate){//unique
                 uniqArray[uniqCount] = value;
                 uniqCount++;
             }
         }
         //create the resulting array of the correct size and copy unique items into it
         int resultArray[] = new int[uniqCount];
         for (int i = 0; i < uniqCount; i++) {
             resultArray[i] = uniqArray[i];
         }
         return resultArray;       
     }
     
     
     
     
     
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int numbersArray[] = new int[10];
        
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Enter ten numbers");
            numbersArray[i] = input.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            System.out.printf("%d, ", numbersArray[i]);   
        }
        
        int uniqueOnly[] = eliminateDuplicate(numbersArray);
        
        System.out.print("Unique only: ");
        for (int n : uniqueOnly) {
            System.out.print(n + ", ");
        }
    }

}
