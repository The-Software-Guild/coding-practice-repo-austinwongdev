/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

/**
 *
 * @author Austin Wong
 */
public class Student {
    
    private static int nextId = 0;
    
    private String firstName;
    private String lastName;
    private String fullName;
    private int studentId;
    
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.studentId = nextId;
        nextId += 1;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    
    public int getStudentId(){
        return this.studentId;
    }
    
}
