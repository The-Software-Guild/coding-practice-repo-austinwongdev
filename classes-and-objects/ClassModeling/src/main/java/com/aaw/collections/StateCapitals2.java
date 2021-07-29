/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: Uses a file to load information into a HashMap about State Capitals instead of hard coding
 */

package com.aaw.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Austin Wong
 */
public class StateCapitals2 {
    
    public static void main(String[] args){
        
        HashMap<String, String> stateCapitalMap = new HashMap<>();
        Scanner scan;
        UserIO userIO = new UserIOImpl();
        try{
            scan = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        }
        catch (FileNotFoundException ex){
            userIO.print("File not found.");
            return;
        }
        
        while (scan.hasNextLine()){
            String currentLine = scan.nextLine();
            String[] lineData = currentLine.split("::");
            String state = lineData[0];
            String capital = lineData[1];
            stateCapitalMap.put(state, capital);
        }
        
        userIO.print(stateCapitalMap.size() + " state/capital pairs loaded.\n");
        userIO.print("HERE ARE THE STATES: ");
        List<String> stateArray = new ArrayList<>();
        for (String state : stateCapitalMap.keySet()){
            userIO.print(state + ", ");
            stateArray.add(state);
        }
        
        Random rng = new Random();
        int randomInt = rng.nextInt(stateArray.size());
        String randomState = stateArray.get(randomInt);
        String userGuess = userIO.readString("\nREADY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF '" + randomState + "'?");
        String answer = stateCapitalMap.get(randomState);
        if (userGuess.equals(answer)){
            userIO.print("NICE WORK! " + answer + " IS CORRECT!");
        }
        else{
            userIO.print("INCORRECT! THE ANSWER IS " + answer + "!");
        }
        
        
    }
    
}
