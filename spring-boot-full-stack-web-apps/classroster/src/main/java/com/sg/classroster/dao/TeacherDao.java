/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 24, 2021
 * purpose: 
 */

package com.sg.classroster.dao;

import com.sg.classroster.model.Teacher;
import java.util.List;

/**
 *
 * @author Austin Wong
 */
public interface TeacherDao {

    Teacher getTeacherById(int id);
    List<Teacher> getAllTeachers();
    Teacher addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacherById(int id);
    
}
