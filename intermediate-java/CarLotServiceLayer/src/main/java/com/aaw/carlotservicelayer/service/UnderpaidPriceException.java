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
public class UnderpaidPriceException extends Exception {

    public UnderpaidPriceException(String message){
        super(message);
    }
    
    public UnderpaidPriceException(String message, Throwable cause){
        super(message, cause);
    }
    
}
