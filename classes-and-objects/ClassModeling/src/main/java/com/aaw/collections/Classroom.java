/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Austin Wong
 */
public class Classroom {

    private Set<Student> roster = new HashSet<>();
    
    public Classroom(){        
    }
    
    public void addStudent(Student student){
        this.roster.add(student);
    }
    
    public Set<Student> getRoster(){
        return this.roster;
    }
    
    public void removeStudent(Student student){
        this.roster.remove(student);
    }
    
    public boolean isEnrolled(Student student){
        return this.roster.contains(student);
    }
    
}
