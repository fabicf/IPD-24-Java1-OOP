/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day06homework_friendslist1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day06HomeWork_FriendsList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declare ArrayList that will hold names of friends.
        Keep asking user for names of their friends until an empty name is entered.
        Afterwards display all the names, comma-separated on a single line.

        Example session:

        Enter friend's name, empty to finish entering: Jerry
        Enter friend's name, empty to finish entering: Marianna
        Enter friend's name, empty to finish entering: Eli
        Enter friend's name, empty to finish entering: Tommy
        Enter friend's name, empty to finish entering: 

        Your friends: Jerry, Marianna, Eli, Tommy
         */

        ArrayList<String> friends = new ArrayList<String>();

        int i = 0;

        String enteredFriends = "";
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter friend's name, empty to finish entering: ");
            enteredFriends = input.nextLine();
            if (enteredFriends.isEmpty()) {
                break;
            }
            friends.add(enteredFriends);
        }
        System.out.printf("Your friends: ");
        for (i = 0; i < friends.size(); i++) {
            System.out.printf(friends.get(i) + ", ");
        }

    }

}
