/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

import java.util.Scanner;
import java.util.Map;

/**
 *
 * @author Austin Wong
 */
public class UserIOImpl implements UserIO {

    @Override
    public void print(String message){
        System.out.println(message);
    }
    
    @Override
    public void printHorizontalLine(int width){
        String separator = "=";
        this.print(separator.repeat(width));
    }
    
    @Override
    public String readString(String prompt){
        this.print(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    
    @Override
    public String readMenuString(Map<String, String> menu){
        String userInput;
        
        do{
            String menuTitle = "MENU";
            this.print(menuTitle);
            this.printHorizontalLine(menuTitle.length());
            for (String option : menu.keySet()){
                String outputLine = option + " - " + menu.get(option);
                this.print(outputLine);
            }
            this.print("");
            userInput = this.readString("Enter selection: ");
        } while (!menu.containsKey(userInput));
        
        this.print("");
        
        return userInput;
    }
    
    @Override
    public int readInt(String prompt){
        int inputInt;
        while (true){
            try{
                inputInt = Integer.parseInt(this.readString(prompt));
                break;
            }
            catch (NumberFormatException ex){
                this.print("Error: input not an integer.");
            }
        }
        return inputInt;
    }
    
    @Override
    public int readInt(String prompt, int min, int max){
        int inputInt;
        do{
            inputInt = readInt(prompt);
        }
        while (inputInt < min || inputInt > max);
        
        return inputInt;
    }
    
    @Override
    public double readDouble(String prompt){
        double inputDouble;
        while (true){
            try{
                inputDouble = Double.parseDouble(this.readString(prompt));
                break;
            }
            catch(NumberFormatException ex){
                this.print("Error: input not a double.");
            }
        }
        return inputDouble;
    }
    
    @Override
    public double readDouble(String prompt, double min, double max){
        double inputDouble;
        do{
            inputDouble = readDouble(prompt);
        }
        while (inputDouble < min || inputDouble > max);
        
        return inputDouble;
    }
    
    @Override
    public float readFloat(String prompt){
        float inputFloat;
        while (true){
            try{
                inputFloat = Float.parseFloat(this.readString(prompt));
                break;
            }
            catch (NumberFormatException ex){
                this.print("Error: input not a float.");
            }
        }
        return inputFloat;
    }
    
    @Override
    public float readFloat(String prompt, float min, float max){
        float inputFloat;
        do{
            inputFloat = readFloat(prompt);
        }
        while (inputFloat < min || inputFloat > max);
        
        return inputFloat;
    }
    
    @Override
    public long readLong(String prompt){
        long inputLong;
        while (true){
            try{
                inputLong = Long.parseLong(this.readString(prompt));
                break;
            }
            catch (NumberFormatException ex){
                this.print("Error: input not a long.");
            }
        }
        return inputLong;
    }
    
    @Override
    public long readLong(String prompt, long min, long max){
        long inputLong;
        do{
            inputLong = readLong(prompt);
        }
        while (inputLong < min || inputLong > max);
        
        return inputLong;
    }
}
