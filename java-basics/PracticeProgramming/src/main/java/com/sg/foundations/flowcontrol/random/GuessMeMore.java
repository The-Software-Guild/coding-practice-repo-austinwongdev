/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Austin Wong
 */
public class GuessMeMore {
    public static void main(String[] args){
        Random rng = new Random();
        int randomNumber = rng.nextInt(201) - 100;
        Scanner input = new Scanner(System.in);
        int guess;
        int numGuesses = 2;
        
        System.out.println("Guess a random number between -100 and 100: ");
        for (int i = 0; i < numGuesses; i++){
            guess = Integer.parseInt(input.nextLine());
            // You can test reaching this point out by setting a seed for rng
            if (guess == randomNumber){
                System.out.println("Wow! That's correct!");
                break;
            }
            else{
                if (i == numGuesses - 1){
                    System.out.println("Game Over.");
                    System.out.println("The answer was: " + randomNumber);
                }
                else{
                    if (guess < randomNumber){
                        System.out.println("Too low.");
                    }
                    else{
                        System.out.println("Too high.");
                    }
                    System.out.println("Guess again: ");
                }
            }
        }
    }
}
