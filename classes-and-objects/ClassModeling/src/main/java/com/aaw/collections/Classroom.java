/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

import java.util.List;

/**
 *
 * @author Austin Wong
 */
public class Classroom {

    private List<Student> roster;
    
    public Classroom(){        
    }
    
    // Does not check for duplicates
    public void addStudent(Student student){
        this.roster.add(student);
    }
    
    public List<Student> getRoster(){
        return this.roster;
    }
    
    public void removeStudent(Student student){
        
    }
    
}
