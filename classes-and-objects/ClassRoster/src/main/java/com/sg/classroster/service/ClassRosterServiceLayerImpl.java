/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 2, 2021
 * purpose: 
 */

package com.sg.classroster.service;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterPersistenceException;
import com.sg.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Austin Wong
 */
public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer {

    ClassRosterDao dao;
    
    public ClassRosterServiceLayerImpl(ClassRosterDao dao){
        this.dao = dao;
    }
    
    @Override
    public void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException{
        
        if (dao.getStudent(student.getStudentId()) != null){
            throw new ClassRosterDuplicateIdException(
                    "ERROR: Could not create student. Student Id "
                    + student.getStudentId()
                    + " already exists");
        }
        
        validateStudentData(student);
        
        dao.addStudent(student.getStudentId(), student);
    }
    
    @Override
    public List<Student> getAllStudents() throws
            ClassRosterPersistenceException{
        
        return dao.getAllStudents();
    }
    
    @Override
    public Student getStudent(String studentId) throws
            ClassRosterPersistenceException{
        return dao.getStudent(studentId);
    }
    
    @Override
    public Student removeStudent(String studentId) throws
            ClassRosterPersistenceException{
        
        return dao.removeStudent(studentId);
    }
    
    private void validateStudentData(Student student) throws
            ClassRosterDataValidationException{
        
        if (student.getFirstName() == null
                || student.getFirstName().trim().length() == 0
                || student.getLastName() == null
                || student.getLastName().trim().length() == 0
                || student.getCohort() == null
                || student.getCohort().trim().length() == 0){
            
            throw new ClassRosterDataValidationException(
                    "ERROR: All fields [First Name, Last Name, Cohort] are required.");
        }
    }
}
