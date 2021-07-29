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
public class ClassRosterDaoException extends Exception{
    
    public ClassRosterDaoException(String message){
        super(message);
    }
    
    public ClassRosterDaoException(String message, Throwable cause){
        super(message, cause);
    }
}
