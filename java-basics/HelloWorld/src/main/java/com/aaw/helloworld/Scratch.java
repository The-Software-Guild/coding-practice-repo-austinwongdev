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
        Random rGen = new Random();
        System.out.println(rGen.nextInt(5));
        System.out.println(rGen.nextInt(5));
        System.out.println(rGen.nextInt(5));
        System.out.println(rGen.nextInt(5));
        System.out.println(rGen.nextInt(5));
    }
}