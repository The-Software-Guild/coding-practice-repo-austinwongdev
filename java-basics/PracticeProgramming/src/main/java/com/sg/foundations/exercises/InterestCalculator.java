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
public class InterestCalculator {
    public static void main(String[] args){
        
        // new amount = CurrentBalance * (1 + (QuarterlyInterestRate / 100))
        
        Scanner scan = new Scanner(System.in);
        float annualInterestRate;
        float initialPrincipal;
        int yearsToInvest;
        int numCompoundedYearly;
        
        System.out.println("How much do you want to invest? ");
        initialPrincipal = Float.parseFloat(scan.nextLine());
        
        System.out.println("How many years are you investing? ");
        yearsToInvest = Integer.parseInt(scan.nextLine());
        
        System.out.println("What is the annual interest rate % growth? ");
        annualInterestRate = Float.parseFloat(scan.nextLine());
        
        System.out.println("Choose a compound period (quarterly, monthly, daily): ");
        String compoundPeriod = scan.nextLine();
        switch (compoundPeriod){
            case "monthly":
                numCompoundedYearly = 12;
                break;
            case "daily":
                numCompoundedYearly = 365;
                break;
            case "quarterly":
            default:
                numCompoundedYearly = 4;
                break;
        }
        
        System.out.println("\nCalculating...");
        
        for (int i = 1; i <= yearsToInvest; i++){
            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + initialPrincipal);
            
            float newAmount = initialPrincipal;
            for (int j = 0; j < numCompoundedYearly; j++){
                newAmount = newAmount * (1 + (annualInterestRate / (100*numCompoundedYearly)));
            }
            System.out.println("Earned $" + (newAmount - initialPrincipal));
            System.out.println("Ended with $" + newAmount);
            initialPrincipal = newAmount;
        }
        
    }
}
