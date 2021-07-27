/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Austin Wong
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many units of fizzing and buzzing do you need in your life? ");
        int number = Integer.parseInt(input.nextLine());
        int count = 0;
        
        // This works much better as while loop in my opinion, but the exercise asks to use a for loop
        System.out.println("0");
        for (int i=1; i<number*3+1; i++){
            
            if (count == number){
                break;
            }
            
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz buzz");
                count += 1;
            }
            else if(i % 3 == 0){
                System.out.println("fizz");
                count += 1;
            }
            else if(i % 5 == 0){
                System.out.println("buzz");
                count += 1;
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!");
    }
}
