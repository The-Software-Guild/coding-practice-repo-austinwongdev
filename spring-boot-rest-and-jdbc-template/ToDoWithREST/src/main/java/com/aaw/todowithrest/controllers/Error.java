/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 18, 2021
 * purpose: 
 */

package com.aaw.todowithrest.controllers;

import java.time.LocalDateTime;

/**
 *
 * @author Austin Wong
 */
public class Error {

    private LocalDateTime timestamp = LocalDateTime.now();
    private String message;
    
    public LocalDateTime getTimestamp(){
        return timestamp;
    }
    
    public void setTimeStamp(LocalDateTime timestamp){
        this.timestamp = timestamp;
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(String message){
        this.message=message;
    }
}
