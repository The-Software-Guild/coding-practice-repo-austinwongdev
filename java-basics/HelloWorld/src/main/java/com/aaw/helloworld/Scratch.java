/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 26, 2021
 * purpose: 
 */

package com.aaw.helloworld;

import java.util.Random;

/**
 *
 * @author Austin Wong
 */
public class Scratch {
    
    static String name = "Betty";
    
    public Scratch(){
        
    }
    
    public static void main(String[] args){
        String delimiter = "::";
        String data = delimiter;
        String[] strArr = data.split(delimiter);
        System.out.println(strArr.length);
    }
    
}
