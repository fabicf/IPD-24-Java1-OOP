/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyingbymyselftestfile2tutorials;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class StudyingByMyselfTestFile2Tutorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arrays
        //how to print arrays = arrays.toString 
        /*
        int[] grades = {9, 5, 7, 8, 9, 2, 8, 3};
        System.out.println(Arrays.toString(grades)); */

        //
        /*
        int size = 4;
        int[] grades = new int[size];
              
        
        for (int i = 0; i < size; i++) {
            grades [i] = i;
            System.out.print(grades[i] + ", ");
            
        }*/
 /*
       int[] grades = {1, 2, 3, 72, 5};
       
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 72){
                System.out.println("Found at index " + i);
            }
        } */
        //2d arrays
        // int[][] studentGrades = new int[3][4];  
        /* 
      int[][] grades = {
          {1, 5, 5},
          {2, 4, 5},
          {4, 6, 2}
      };
      
        System.out.println(grades[1][1]);
        System.out.println(Arrays.deepToString(grades));
         */
        
        
        /* ======array 2d with for loop ==============
        int[][] grades = {
            {1, 5, 5},
            {2, 4, 5, 4, 5},
            {4, 6, 2},
            {4, 6, 2},
        };

        System.out.println(grades.length); //rows
        System.out.println(grades[1].length); //row length
        System.out.println("==========");


        for(int i = 0; i < grades.length; i++){
            for(int k = 0; k < grades[i].length; k++){
                System.out.print(grades[i][k]+ " ");
            }
            System.out.println();
        }
*/
        
        /*
        //ArrayList
        
        ArrayList <Integer> grades = new ArrayList<Integer>();
        /* grades.add(5);
        grades.get(0);
        grades.set(0, 10);
        grades.size(); */
        /*
        grades.add(5); //index 0 --> index 0
        grades.add(10); //index 1 --> index 2
        grades.add(1,7); //index 2 --> index 1
        
        System.out.println(grades.get(1));
        System.out.println(grades.indexOf(7));
        System.out.println(grades.indexOf(70)); //will print -1, because it doesn't exists
        System.out.println(grades.contains(7));
        
        grades.clear(); */
        
        
        List<Integer> grades = Arrays.asList(5, 3, 2, 6, 3); 
        
        for (int i = 0; i < grades.size(); i++) {
            //System.out.println(grades.get(i));
        }
        
        for (int grade : grades){
            System.out.println(grade);
        }
        
        
        
    }

}
