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
public class ClassRosterDuplicateIdException extends Exception {

    public ClassRosterDuplicateIdException(String message){
        super(message);
    }
    
    public ClassRosterDuplicateIdException(String message,
            Throwable cause){
        super(message, cause);
    }
    
}
