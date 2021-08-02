/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Austin Wong
 */
public class ArrayExerciseATest {
    
    public ArrayExerciseATest() {
    }
    
    /* Test Plan:
    ** maxOfArrayTest([3,3]) -> 3
    ** maxOfArrayTest([3]) -> 3
    ** maxOfArrayTest([3, 9, 12]) -> 12
    ** maxOfArrayTest([12, 9, 3]) -> 12
    ** maxOfArrayTest([-30, -20, -10]) -> -10
    ** maxOfArrayTest([-10, -20, -30]) -> -10
    */
    
    @Test
    public void testDuplicateNumbers3(){
        
        // ARRANGE
        int[] numbers = {3,3};
        int expectedMax = 3;
        
        // ACT
        int result = maxOfArray(numbers);
        
        // ASSERT
        assertEquals(expectedMax, result, "Max of [3,3] should be 3.");
    }
    
    @Test
    public void testOneNumber7(){
        
        int[] numbers = {7};
        
        int result = maxOfArray(numbers);
        
        assertEquals(7, result, "Max of [7] should be 7.");
    }
    
    @Test
    public void testPositiveNumbersIncreasing(){
        int[] numbers = {3, 9, 12};
        
        int result = maxOfArray(numbers);
        
        assertEquals(12, result, "Max of [3, 9, 12] should be 12.");
    }
    
    @Test
    public void testPositiveNumbersDecreasing(){
        int[] numbers = {12, 9, 3};
        
        int result = maxOfArray(numbers);
        
        assertEquals(12, result, "Max of [12, 9, 3] should be 3.");
    }
    
    @Test
    public void testNegativeNumbersIncreasing(){
        int[] numbers = {-30, -20, -10};
        int result = maxOfArray(numbers);
        assertEquals(-10, result, "Max of [-30, -20, -10] should be -10.");
    }
    
    @Test
    public void testNegativeNumbersDecreasing(){
        int[] numbers = {-10, -20, -30};
        int result = maxOfArray(numbers);
        assertEquals(-10, result, "Max of [-10, -20, -30] should be -10.");
    }
    
}
