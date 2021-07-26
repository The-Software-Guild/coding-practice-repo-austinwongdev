/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 26, 2021
 * purpose: 
 */

package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Austin Wong
 */
public class MiniMadLibs {
    public static void main(String[] args){
        String noun1;
        String noun2;
        String adjective1;
        String adjective2;
        int number;
        String pluralNoun1;
        String pluralNoun2;
        String pluralNoun3;
        String verbPresent;
        String verbPast;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Enter a noun: ");
        noun1 = inputReader.nextLine();

        System.out.println("Enter an adjective: ");
        adjective1 = inputReader.nextLine();
        
        System.out.println("Enter another noun: ");
        noun2 = inputReader.nextLine();
        
        System.out.println("A number: ");
        number = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Another adjective: ");
        adjective2 = inputReader.nextLine();
        
        System.out.println("A plural noun: ");
        pluralNoun1 = inputReader.nextLine();
        
        System.out.println("A second plural noun: ");
        pluralNoun2 = inputReader.nextLine();
        
        System.out.println("A third plural noun: ");
        pluralNoun3 = inputReader.nextLine();
        
        System.out.println("A verb (present tense): ");
        verbPresent = inputReader.nextLine();
        
        System.out.println("The same verb in past tense: ");
        verbPast = inputReader.nextLine();
        
        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are"
                + " the voyages of the starship " + noun2 + ". Its " + number
                + "-year mission: to explore strange " + adjective2 + " "
                + pluralNoun1 + ", to seek out " + adjective2 + " " + pluralNoun2
                + " and " + adjective2 + " " + pluralNoun3 + ", to boldly "
                + verbPresent + " where no one has " + verbPast + " before.");
        
    }
}
