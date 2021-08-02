/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.io.FileWriter;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Austin Wong
 */
public class ClassRosterDaoFileImplTest {
    
    ClassRosterDao testDao;
    
    public ClassRosterDaoFileImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws Exception {
        String testFile = "testroster.txt";
        new FileWriter(testFile);
        this.testDao = new ClassRosterDaoFileImpl(testFile);
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddGetStudent() throws Exception{
        
        String studentId = "0001";
        Student student = new Student(studentId);
        student.setFirstName("Ada");
        student.setLastName("Lovelace");
        student.setCohort("Java-May-1845");
        
        // Add the student to the DAO
        testDao.addStudent(studentId, student);
        // Get the student from the DAO
        Student retrievedStudent = testDao.getStudent(studentId);
        
        // Check the data is equal
        assertEquals(student.getStudentId(),
                retrievedStudent.getStudentId(),
                "Checking student id.");
        assertEquals(student.getFirstName(),
                retrievedStudent.getFirstName(),
                "Checking student first name.");
        assertEquals(student.getLastName(),
                retrievedStudent.getLastName(),
                "Checking student last name.");
        assertEquals(student.getCohort(),
                retrievedStudent.getCohort(),
                "Checking student cohort.");
    }
    
    @Test
    public void testAddGetAllStudents() throws Exception {
        //Create our first student
        Student firstStudent = new Student("0001");
        firstStudent.setFirstName("Ada");
        firstStudent.setLastName("Lovelace");
        firstStudent.setCohort("Java-May-1845");
        
        // Create our second student
        Student secondStudent = new Student("0002");
        secondStudent.setFirstName("Charles");
        secondStudent.setLastName("Babbage");
        secondStudent.setCohort(".NET-May-1845");
        
        // Add both our students to the DAO
        testDao.addStudent(firstStudent.getStudentId(), firstStudent);
        testDao.addStudent(secondStudent.getStudentId(), secondStudent);
        
        // Retrieve the list of all students within the DAO
        List<Student> allStudents = testDao.getAllStudents();
        
        // First check the general contents of the list
        assertNotNull(allStudents, "The list of students must not be null.");
        assertEquals(2, allStudents.size(), 
                "The list of students should have 2 students.");
        
        // Then the specifics
        // This will fail if you don't add equals/hashCode additions to the
        // Student class.
        assertTrue(testDao.getAllStudents().contains(firstStudent),
                "The list of students should include Ada.");
        assertTrue(testDao.getAllStudents().contains(secondStudent),
                "The list of students should include Charles.");
    }
    
    @Test
    public void testRemoveStudent() throws Exception {
        //Create our first student
        Student firstStudent = new Student("0001");
        firstStudent.setFirstName("Ada");
        firstStudent.setLastName("Lovelace");
        firstStudent.setCohort("Java-May-1845");
        
        // Create our second student
        Student secondStudent = new Student("0002");
        secondStudent.setFirstName("Charles");
        secondStudent.setLastName("Babbage");
        secondStudent.setCohort(".NET-May-1845");
        
        // Add both our students to the DAO
        testDao.addStudent(firstStudent.getStudentId(), firstStudent);
        testDao.addStudent(secondStudent.getStudentId(), secondStudent);
        
        // Remove the first student - Ada
        Student removedStudent = 
                testDao.removeStudent(firstStudent.getStudentId());
        
        // Check that the correct object was removed;
        assertEquals(removedStudent, firstStudent,
                "The removed student should be Ada.");
        
        // Get all the students
        List<Student> allStudents = testDao.getAllStudents();
        
        // First check the general contents of the list
        assertNotNull(allStudents, "All students list should be not null.");
        assertEquals(1, allStudents.size(), 
                "All students should only have 1 student.");
        
        // Then the specifics
        assertFalse(allStudents.contains(firstStudent),
                "All students should NOT include Ada.");
        assertTrue(allStudents.contains(secondStudent),
                "All students should include Charles.");
        
        // Remove the second student
        removedStudent = testDao.removeStudent(secondStudent.getStudentId());
        // Check that the correct object was removed.
        assertEquals(removedStudent, secondStudent, 
                "The removed student should be Charles.");
        
        // retrieve all of the students again, and check the list
        allStudents = testDao.getAllStudents();
        
        // Check the contents of the list - it should be empty
        assertTrue(allStudents.isEmpty(),
                "The retrieved list of students should be empty.");
        
        // Try to 'get' both students by their old id - they should be null!
        Student retrievedStudent =
                testDao.getStudent(firstStudent.getStudentId());
        assertNull(retrievedStudent, "Ada was removed, should be null.");
        
        retrievedStudent = testDao.getStudent(secondStudent.getStudentId());
        assertNull(retrievedStudent, "Charles was removed, should be null.");
    }
}
