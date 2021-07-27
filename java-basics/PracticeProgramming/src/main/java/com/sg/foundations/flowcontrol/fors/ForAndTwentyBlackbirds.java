/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Austin Wong
 */
public class ForAndTwentyBlackbirds {
    public static void main(String[] args){
        
        int birdsInPie = 0;
        
        // Changed i=0 to i=1 to start count at 1
        // Changed i < 20 to i < 25 to accomodate 24 birds instead of 20
        for (int i = 1; i < 25; i++){
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}
