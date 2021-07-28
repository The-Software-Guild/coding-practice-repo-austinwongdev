/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Austin Wong
 */
public class StateCapitals {
    public static void main(String[] args){
        
       Map<String, String> stateCapitals = getStateCapitals();
       
       Set<String> states = stateCapitals.keySet();
       System.out.println("STATES:\n=======");
       for (String state: states){
           System.out.println(state);
       }
       
       Collection<String> capitals = stateCapitals.values();
       System.out.println("CAPITALS:\n========");
       for (String capital: capitals){
           System.out.println(capital);
       }
       
       System.out.println("STATE/CAPITAL PAIRS:\n====================");
       for (String state: states){
           System.out.println(state + " - " + stateCapitals.get(state));
       }
        
    }
    
    private static Map<String, String> getStateCapitals(){
         Map<String, String> stateCapitals = new HashMap<>();
        
        String[] states = {
            "Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York",
            "North Carolina",
            "North Dakota",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "Rhode Island",
            "South Carolina",
            "South Dakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wisconsin",
            "Wyoming"
        };
        
        String[] capitals = {
            "Montgomery",
            "Juneau",
            "Phoenix Little",
            "Rock",
            "Sacramento",
            "Denver",
            "Hartford",
            "Dover",
            "Tallahassee",
            "Atlanta",
            "Honolulu",
            "Boise",
            "Springfield",
            "Indianapolis",
            "Des Moines",
            "Topeka",
            "Frankfort",
            "Baton Rouge",
            "Augusta",
            "Annapolis",
            "Boston",
            "Lansing",
            "Saint Paul",
            "Jackson",
            "Jefferson City",
            "Helena",
            "Lincoln",
            "Carson City",
            "Concord",
            "Trenton",
            "Santa Fe",
            "Albany",
            "Raleigh",
            "Bismarck",
            "Columbus",
            "Oklahoma City",
            "Salem",
            "Harrisburg",
            "Providence",
            "Columbia",
            "Pierre",
            "Nashville",
            "Austin",
            "Salt Lake City",
            "Montpelier",
            "Richmond",
            "Olympia",
            "Charleston",
            "Madison",
            "Cheyenne"
        };
        
        for (int i = 0; i < states.length; i++){
            stateCapitals.put(states[i], capitals[i]);
        };
        
        return stateCapitals;
    }
}
