/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 26, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 * Requirements:
 *  Includes at least 3 locations (come up with one more)
 *  Includes at least 2 choices for each location (at least 1 moves player)
 * @author Austin Wong
 */
public class MiniZork {
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");
        
        String action = userInput.nextLine();
        
        if (action.equals("open the mailbox")){
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();
            
            if (action.equals("look inside")){
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();
                
                if (action.equals("keep looking")){
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                }
                else if (action.equals("run away")){
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            }
            else if (action.equals("stick your hand in")){
                System.out.println("A goblin pulls you into the mailbox.");
            }
        }
        else if (action.equals("go to the house")){
            System.out.println("You arrive at the house.");
            System.out.println("Cobwebs cover the doorway.");
            System.out.println("Go inside or ring the doorbell? ");
            action = userInput.nextLine();
            
            if (action.equals("go inside")){
                System.out.println("The door creaks as you enter the house.");
                System.out.println("There is a note floating in a pool of blood.");
                System.out.println("Pick up the note or run to the field? ");
                action = userInput.nextLine();
                
                if (action.equals("pick up the note")){
                    System.out.println("You walk over to the note.");
                    System.out.println("While trying to pick it up you slip.");
                    System.out.println("You fall and pass out.");
                }
                else if (action.equals("run to the field")){
                    System.out.println("You bolt out the door.");
                    System.out.println("And escape successfully.");
                }
            }
            else if (action.equals("ring the doorbell")){
                System.out.println("The doorbell doesn't work.");
                System.out.println("You try again.");
                System.out.println("A trap door releases under you.");
                System.out.println("You fall into a pit of darkness.");
            }
        }
    }
}
