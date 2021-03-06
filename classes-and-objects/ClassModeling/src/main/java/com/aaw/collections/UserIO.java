/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

import java.util.Map;

/**
 *
 * @author Austin Wong
 */
public interface UserIO {
    
    void print(String message);
    
    void printHorizontalLine(int width);
    
    void printWithLine(String message);
    
    String readString(String prompt);
    
    String readMenuString(Map<String, String> menu);
    
    int readInt(String prompt);
    
    int readInt(String prompt, int min, int max);
    
    double readDouble(String prompt);
    
    double readDouble(String prompt, double min, double max);
    
    float readFloat(String prompt);
    
    float readFloat(String prompt, float min, float max);
    
    long readLong(String prompt);
    
    long readLong(String prompt, long min, long max);
    
}
