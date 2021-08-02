/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 29, 2021
 * purpose: 
 */

package com.sg.classroster.dao;

/**
 *
 * @author Austin Wong
 */
public class ClassRosterPersistenceException extends Exception{
    
    public ClassRosterPersistenceException(String message){
        super(message);
    }
    
    public ClassRosterPersistenceException(String message, Throwable cause){
        super(message, cause);
    }
}
