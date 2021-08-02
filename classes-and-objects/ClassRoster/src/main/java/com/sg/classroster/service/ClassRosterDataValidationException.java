/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 2, 2021
 * purpose: 
 */

package com.sg.classroster.service;

/**
 *
 * @author Austin Wong
 */
public class ClassRosterDataValidationException extends Exception {

    public ClassRosterDataValidationException(String message){
        super(message);
    }
    
    public ClassRosterDataValidationException(String message,
            Throwable cause){
        super(message, cause);
    }
}
