/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05prepquiz2namesarray1;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day05PrepQuiz2NamesArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declare array of 4 Strings.
        Ask user to enter name of 4 friends and save those names in the array.
        Display back names of friends to the user, on per line.

        Example session:

        Enter friend's name: Jerry
        Enter friend's name: Alan
        Enter friend's name: Terry
        Enter friend's name: Maria

        Your friends are:
        Friend #1: Jerry
        Friend #2: Alan
        Friend #3: Terry
        Friend #4: Maria
        */
        Scanner input = new Scanner(System.in);        
        String[] yourFriends = new String [4];
                
        for (int i = 0; i < yourFriends.length; i++) {
            System.out.print("Enter friend's name: ");
            yourFriends[i] = input.nextLine();
            
        }
        
        for (int i = 0; i < yourFriends.length; i++) {
            System.out.println("Friend #" + (i+1) + ": " + yourFriends[i]);
        }
    }
    
}
