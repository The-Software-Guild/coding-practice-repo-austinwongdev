/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Austin Wong
 */
public class LazyTeenager {
    public static void main(String[] args){
        
        Random rng = new Random();
        int chanceOfCleaning;
        int i = 1;
        
        do{
            System.out.println("Clean your room! (x" + i + ")");
            chanceOfCleaning = rng.nextInt(10);
            if (chanceOfCleaning < i){
                System.out.println("Fine I'll clean my room!");
                break;
            }
            i += 1;
        }
        while (i < 8);
        
        if (chanceOfCleaning >= i-1){
            System.out.println("That's it, I'm doing it! You're grounded and I'm taking your Xbox!");
        }
    }
}
