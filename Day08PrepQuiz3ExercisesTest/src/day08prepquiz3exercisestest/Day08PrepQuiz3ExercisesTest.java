/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercisestest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3ExercisesTest {

   

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
                
        ArrayList<String> friends = new ArrayList <String>();
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter Friends Name, empty to stop: ");
            String name = input.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            friends.add(name);
        }
        System.out.print("Your friends: ");
        for (int i = 0; i < friends.size(); i++) {
            //System.out.print(friends.get(i) + ", ");
            System.out.printf(i == friends.size()-1 ? friends.get(i) : friends.get(i) + ", ");   
        }
        System.out.println();
    }

}
