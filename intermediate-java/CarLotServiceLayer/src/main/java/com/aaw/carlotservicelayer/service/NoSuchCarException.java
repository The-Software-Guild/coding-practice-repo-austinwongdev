/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 3, 2021
 * purpose: 
 */

package com.aaw.carlotservicelayer.service;

/**
 *
 * @author Austin Wong
 */
public class NoSuchCarException extends Exception {

    public NoSuchCarException(String message){
        super(message);
    }
    
    public NoSuchCarException(String message, Throwable cause){
        super(message, cause);
    }
    
}
