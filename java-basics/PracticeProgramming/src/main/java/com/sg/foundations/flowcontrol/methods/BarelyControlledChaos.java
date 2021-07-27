/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author Austin Wong
 */
public class BarelyControlledChaos {
    public static void main(String[] args){
        
        String color = getColor(); // call color method here
        String animal = getAnimal(); // call animal method again here
        String colorAgain = getColor(); // call color method again here
        int weight = getRandomNumber(5,200); // call number method,
            // with a range between 5 - 200
        int distance = getRandomNumber(10,20); // call number method,
            // with a range between 10 - 20
        int number = getRandomNumber(10000,20000); // call number method,
            // with a range between 10000 - 20000
        int time = getRandomNumber(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
    
    static String getColor(){
        int number = getRandomNumber(0,4);
        String[] colors = {"red", "blue", "green", "orange", "pink"};
        return colors[number];
    }
    
    static String getAnimal(){
        int number = getRandomNumber(0,4);
        String[] animals = {"lion","tiger","bear","dog","cat"};
        return animals[number];
    }
    
    static int getRandomNumber(int min, int max){
        Random rng = new Random();
        int number = rng.nextInt(max-min+1)+min;
        return number;
    }
}
