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
public class OverpaidPriceException extends Exception {

    public OverpaidPriceException(String message){
        super(message);
    }
    
    public OverpaidPriceException(String message, Throwable cause){
        super(message, cause);
    }
    
}
