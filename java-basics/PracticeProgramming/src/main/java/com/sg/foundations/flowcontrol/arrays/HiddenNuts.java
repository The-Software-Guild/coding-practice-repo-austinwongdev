/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;

/**
 *
 * @author Austin Wong
 */
public class HiddenNuts {
    public static void main(String[] args){
        
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        
        for (int i = 0; i < hidingSpots.length; i++){
            // Could also include check for hidingSpots[i].equals("Nut")
            // But we can get away with this this time since we don't set any other values
            if (hidingSpots[i] != null){
                System.out.println("Found it! It's in spot# " + i);
                break;
            }
        }
    }
}
