/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 26, 2021
 * purpose: 
 */

package com.aaw.helloworld;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Austin Wong
 */
public class Scratch {
    
    static String name = "Betty";
    
    public Scratch(){
        
    }
    
    public static void main(String[] args) throws Exception{
        Map<Integer, Integer> myMap = new TreeMap<>();
        myMap.put(1, 10);
        myMap.put(3, 30);
        myMap.put(2, 20);
        myMap.put(4, 40);
        myMap.put(5, 50);
        myMap.put(6, 60);
        
        myMap.values().forEach((val) -> System.out.println(val));
    }
    
}
