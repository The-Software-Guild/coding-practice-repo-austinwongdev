/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Austin Wong
 */
public class LuckySevens {
    public static void main(String[] args){
        int numDollars;
        int minRoll = 1;
        int maxRoll = 6;
        int numDice = 2;
        int numRolls = 0;
        int optimumRolls = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many dollars do you have? ");
        numDollars = Integer.parseInt(scan.nextLine());
        int maxDollars = numDollars;
        
        Random rng = new Random();
        while (numDollars > 0){
            int currentRoll = 0;
            for (int i = 0; i < numDice; i++){
                currentRoll += rng.nextInt(maxRoll - minRoll + 1) + minRoll;
            }
            numRolls += 1;
            if (currentRoll == 7){
                numDollars += 4;
                if (numDollars > maxDollars){
                    optimumRolls = numRolls;
                    maxDollars = numDollars;
                }
            }
            else{
                numDollars -= 1;
            }
        }
        
        System.out.println("You are broke after " + numRolls + " rolls.");
        System.out.println("You should have quite after " + optimumRolls
                + " rolls when you had $" + maxDollars);
    }
}
