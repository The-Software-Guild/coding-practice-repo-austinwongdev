/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg;

import static com.sg.llamas.HappyLlamasImpl.areTheLlamasHappy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Austin Wong
 */
public class HappyLlamasTest {
    
    public HappyLlamasTest() {
    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testNormalTrampoline10(){
        // ARRANGE
        boolean isNasaFabric = false;
        int numTrampolines = 10;
        
        // ACT
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);
        
        // ASSERT
        assertFalse(result, "10 Llamas w/ Normal Trampolines should be Unhappy!");
    }
    
}
