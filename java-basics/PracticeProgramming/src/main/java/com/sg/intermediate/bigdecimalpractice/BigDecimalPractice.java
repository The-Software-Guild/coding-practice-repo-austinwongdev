/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 3, 2021
 * purpose: 
 */

package com.sg.intermediate.bigdecimalpractice;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Austin Wong
 */
public class BigDecimalPractice {

    public static void main(String[] args){
        
        // Instantiate using String constructor
        BigDecimal a = new BigDecimal("42.35");
        
        // Produces error b/c we need to pass in rounding mode when getting
        // rid of extra digit
        // BigDecimal b = a.setScale(1);

        BigDecimal b = a.setScale(1, RoundingMode.HALF_UP);
        System.out.println(b.toString());
        
        b = a.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(b.toString());
        
        BigDecimal op1 = new BigDecimal("10");
        BigDecimal op2 = new BigDecimal("6");
        // Error b/c there is an infinitely repeating value to the right
        // of the decimal point and no rounding mode set
        // BigDecimal c = op1.divide(op2);
        
        BigDecimal c = op1.divide(op2, 2, RoundingMode.DOWN);
        System.out.println(c.toString());
        
        c = op1.divide(op2, RoundingMode.HALF_UP);
        System.out.println(c);
        
        // For this course use scale = 2 and Rounding = HALF_UP
    }
}
