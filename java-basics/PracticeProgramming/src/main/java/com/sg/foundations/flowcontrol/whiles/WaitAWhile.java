/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Austin Wong
 */
public class WaitAWhile {
    public static void main(String[] args){
        // If we change this to 11 then we never enter the while loop
        int timeNow = 5;
        
        // If we change this to 11 then we get one more iteration through the while loop
        int bedTime = 10;
        
        while (timeNow < bedTime){
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiitle longer....");
            
            // If we comment this out, then we will enter an infinite loop
            timeNow++; // Time passes
        }
        
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
