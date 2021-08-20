/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 26, 2021
 * purpose: 
 */

package com.aaw.helloworld;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Austin Wong
 */
public class Scratch {
    
    static String name = "Betty";
    
    public Scratch(){
        
    }
    
    public static void main(String[] args) throws Exception{
          System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
    
}
