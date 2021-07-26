/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: 7/26/21
 * purpose: Calculates the total cost of windows and trim based on user-input window size, material costs, and number of windows
 */

package com.aaw.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Austin Wong
 */
public class Window {
    
    public static void main(String[] args){
        
        String input;
        float height = 0;
        float width = 0;
        float area;
        float perimeter;
        float glassCost = 3.50f;
        float trimCost = 2.25f;
        float totalCost;
        int numWindows = 1;
        
        Scanner scan = new Scanner(System.in);
        
        // Get user input
        try{
            System.out.println("Enter height of window in feet: ");
            input = scan.nextLine();
            height = Float.parseFloat(input);
                    
            System.out.println("Enter width of window in feet: ");
            input = scan.nextLine();
            width = Float.parseFloat(input);
        
            System.out.println("Enter cost of glass in dollars per square foot: ");
            input = scan.nextLine();
            glassCost = Float.parseFloat(input);
        
            System.out.println("Enter cost of trim in dollars per foot: ");
            input = scan.nextLine();
            trimCost = Float.parseFloat(input);
        }
        catch (NumberFormatException ex){
            System.out.println("Not a number");
        }
        
        try{
            System.out.println("Enter number of windows: ");
            input = scan.nextLine();        
            numWindows = Integer.parseInt(input);
        }
        catch (NumberFormatException ex){
            System.out.println("Not a whole number");
        }
        
        // Perform calculations
        perimeter = 2 * (height + width);
        area = height * width;
        totalCost = numWindows * ((trimCost * perimeter) + (glassCost * area));
        
        // Output results
        System.out.println("Area per window: " + area);
        System.out.println("Perimeter per window: " + perimeter);
        System.out.println("Total Cost: " + totalCost);
        
    }
    
}
