/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 26, 2021
 * purpose: 
 */

package com.aaw.helloworld;

import java.io.FileWriter;

/**
 *
 * @author Austin Wong
 */
public class Scratch {
    
    static String name = "Betty";
    
    public Scratch(){
        
    }
    
    public static void main(String[] args) throws Exception{
        String testFile = "testroster.txt";
        new FileWriter(testFile);
    }
    
}
