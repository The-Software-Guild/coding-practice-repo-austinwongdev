/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 2, 2021
 * purpose: 
 */

package com.sg.intermediate.enums;

import java.util.Scanner;

/**
 *
 * @author Austin Wong
 */

public class App {
    public static void main(String[] args){
        
        App app = new App();
        //app.getDaysUntilFriday();
        
        
    }
    
    
    
    private void getDaysUntilFriday(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a day of the week:");
        String userInput = scan.nextLine().toUpperCase();
        DaysOfWeek day = DaysOfWeek.valueOf(userInput);
        int daysUntilFriday;
        
        switch (day) {
            case SUNDAY:
                daysUntilFriday = 5;
                break;
            case MONDAY:
                daysUntilFriday = 4;
                break;
            case TUESDAY:
                daysUntilFriday = 3;
                break;
            case WEDNESDAY:
                daysUntilFriday = 2;
                break;
            case THURSDAY:
                daysUntilFriday = 1;
                break;
            case FRIDAY:
                daysUntilFriday = 0;
                break;
            case SATURDAY:
                daysUntilFriday = 6;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        
        System.out.println(daysUntilFriday + " days until Friday!");
    }
}
