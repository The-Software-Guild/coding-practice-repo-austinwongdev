/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 2, 2021
 * purpose: 
 */

package com.sg.classroster.service;

import com.sg.classroster.dao.ClassRosterPersistenceException;
import com.sg.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Austin Wong
 */
public interface ClassRosterServiceLayer {

    void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException;
    
    List<Student> getAllStudents() throws
            ClassRosterPersistenceException;
    
    Student getStudent(String studentId) throws
            ClassRosterPersistenceException;
    
    Student removeStudent(String studentId) throws
            ClassRosterPersistenceException;
    
}
