/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05prepquiz2namesstats;

import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day05PrepQuiz2NamesStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Keep asking user for names of friends. Empty name ends the loop.
        At the end display the longest name entered and display the sum of the length of all names entered.
        Example session:
        Enter friend's name, empty to end: Jerry
        Enter friend's name, empty to end: Eva
        Enter friend's name, empty to end: Marianna
        Enter friend's name, empty to end: 
        Longest name is Marianna
        Total number of characters entered is 16 */
        
        Scanner input = new Scanner(System.in);
        int longestName = 0;
        int sumNameLenght = 0;
        String longestFriendsName = "";
        while (true) {
            System.out.println("Enter friend's name, empty to end: ");
            String friendsName = input.nextLine();
            if (friendsName.isEmpty()) {
                break;
            }
            int nameLenght = friendsName.length();
            if (nameLenght > longestName ){
                longestName = nameLenght;
                longestFriendsName = friendsName;
            }
                        
            sumNameLenght += nameLenght;
        }
        
        System.out.println("Longest name is: " + longestFriendsName);
        System.out.println("Total number of characters enterd is: " + sumNameLenght);
    }

}
