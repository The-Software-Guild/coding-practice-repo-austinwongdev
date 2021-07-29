/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

/**
 *
 * @author Austin Wong
 */
public class StateCapitalsApp {

    private UserIO userIO = new UserIOImpl();;
    private HashMap<String, Capital> stateCapitals = new HashMap<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        
        StateCapitalsApp stateCapitalsApp = new StateCapitalsApp();
        
        // Unmarshaling State Capital Data
        
        FileReader file = new FileReader("MoreStateCapitals.txt");
        Scanner scan = new Scanner(new BufferedReader(file));
        while (scan.hasNextLine()){
            String currentLine = scan.nextLine();
            String[] lineData = currentLine.split("::");
            String state = lineData[0];
            String capitalStr = lineData[1];
            int population = Integer.parseInt(lineData[2]);
            float squareMileage = Float.parseFloat(lineData[3]);
            
            Capital capitalObj = new Capital(capitalStr, population, squareMileage);
            stateCapitalsApp.stateCapitals.put(state, capitalObj);
        }
        
        // Display load results to user
        stateCapitalsApp.userIO.printWithLine(stateCapitalsApp.stateCapitals.size() + " STATE/CAPITAL PAIRS LOADED.");
        stateCapitalsApp.printStateInfo(-1, -1f);
        
        // Display states above user-input population threshold
        int populationMin = stateCapitalsApp.userIO.readInt("Please enter the lower limit for capital city population: ");
        stateCapitalsApp.printStateInfo(populationMin, -1f);
        
        // Display states below user-input square mileage limit
        float squareMileageMax = stateCapitalsApp.userIO.readFloat("Please enter the upper limit for capital city sq mileage: ");
        stateCapitalsApp.printStateInfo(-1, squareMileageMax);
    }
    
    public void printStateInfo(int populationMin, float squareMileageMax){
        
        String titleStr;
        
        if (populationMin != -1){
            titleStr = "LISTING CAPITALS WITH POPULATIONS GREATER THAN " + populationMin;
        }
        else if (squareMileageMax != -1){
            titleStr = "LISTING CAPITALS WITH POPULATIONS LESS THAN " + squareMileageMax;
        }
        else{
            titleStr = "LISTING STATE/CAPITAL PAIRS";
        }
        
        this.userIO.print(titleStr);
        for (String state : this.stateCapitals.keySet()){
            Capital capital = this.stateCapitals.get(state);
            if ((populationMin != -1 && capital.getPopulation() <= populationMin)
                || (squareMileageMax != -1f && capital.getSquareMileage() >= squareMileageMax)){
                continue;
            }
            String stateInfo = state + " - " + capital.getInfo();
            this.userIO.print(stateInfo);
        }
    }
}
