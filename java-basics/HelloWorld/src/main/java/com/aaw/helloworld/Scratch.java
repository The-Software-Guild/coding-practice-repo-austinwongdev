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
    public static void main(String[] args){
        String test = "Alabama::Montgomery::205764::155.4";
        for (String i : test.split("::")){
            System.out.println(i);
        }
    }
}
