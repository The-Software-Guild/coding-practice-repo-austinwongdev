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
public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer {

    @Override
    public void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public List<Student> getAllStudents() throws
            ClassRosterPersistenceException{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Student getStudent(String studentId) throws
            ClassRosterPersistenceException{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Student removeStudent(String studentId) throws
            ClassRosterPersistenceException{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
