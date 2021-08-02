/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 29, 2021
 * purpose: 
 */

package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Austin Wong
 */
public interface ClassRosterDao {

    Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException;
    
    List<Student> getAllStudents() throws ClassRosterPersistenceException;
    
    Student getStudent(String studentId) throws ClassRosterPersistenceException;
    
    /**
     * Description
     * 
     * @param studentId id of student to be removed
     * @return Student object that was removed or null if no student was
     * associated with the given student id
     */
    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
    
}
