/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.exercises;

import java.util.Scanner;

/**
 *
 * @author Austin Wong
 */
public class Factorizer {
    public static void main(String[] args){
        
        int runningTotal = 0;
        
        // Optimization: Handle negative numbers
        // boolean negative;
        
        // Read input
        Scanner input = new Scanner(System.in);
        System.out.println("What number would you like to factor? ");
        int number = Integer.parseInt(input.nextLine());
        int numFactors = 0;
        
        // Output
        System.out.println("The factors of " + number + " are:");
        
        // Handle edge cases
        if (number == 0){
            System.out.println("0 has no factors.");
            System.out.println("Therefore, 0 is not a perfect number.");
            System.out.println("And 0 is not a prime number.");
            return;
        }
        else if (number == 1){
            System.out.println("1");
            System.out.println("1 has 1 factor.");
            System.out.println("1 is a perfect number.");
            System.out.println("1 is not a prime number.");
            return;
        }
        
        // Print out factors of number
        for (int i = 1; i <= number/2; i++){
            if (number % i == 0){
                System.out.print(i + " ");
                runningTotal += i;
                numFactors += 1;
            }
        }
        // Account for number itself
        System.out.println(number);
        numFactors += 1;
        
        
        // Print total # of factors, perfect number or not, prmie number or not
        System.out.println(number + " has " + numFactors + " factors.");
        String isPerfect = "";
        if (runningTotal != number){
            isPerfect = "not ";
        }
        String isPrime = "";
        if (numFactors != 2){
            isPrime = "not ";
        }
        System.out.println(number + " is " + isPerfect + "a perfect number.");
        System.out.println(number + " is " + isPrime + "a prime number.");
    }
}
