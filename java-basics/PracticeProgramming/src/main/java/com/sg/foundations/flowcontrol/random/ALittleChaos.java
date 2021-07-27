/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 26, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.random;

import java.util.Random;
/**
 *
 * @author Austin Wong
 */
public class ALittleChaos {
    public static void main(String[] args){
        Random randomizer = new Random();
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100);
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");
        
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
        
        /* This will restrict the range to 0-50 and then add 50
         * Thus, the resulting range will be from 50 to 100 (inclusive)
        */
        System.out.println(randomizer.nextInt(51)+50);
        System.out.println(randomizer.nextInt(51)+50);
        System.out.println(randomizer.nextInt(51)+50);
        System.out.println(randomizer.nextInt(51)+50);
        System.out.println(randomizer.nextInt(51)+50);
        
        // You can include random numbers in a math statement
        System.out.println(randomizer.nextInt(30) + randomizer.nextInt(1000));
        System.out.println(randomizer.nextInt(30) + randomizer.nextInt(1000));
        
        // You can also do math operations with different types of numbers
        System.out.println(randomizer.nextDouble()*30 - randomizer.nextInt(200));
    }
}
