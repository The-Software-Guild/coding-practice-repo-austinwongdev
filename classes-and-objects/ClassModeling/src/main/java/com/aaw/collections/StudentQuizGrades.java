/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;

/**
 *
 * @author Austin Wong
 */
public class StudentQuizGrades {
    
    private Map<String, ArrayList<Integer>> studentQuizData = new HashMap<>();
    
    public static void main(String[] args){
        
        StudentQuizGrades sqg = new StudentQuizGrades();
        UserIO userIO = new UserIOImpl();
        String userMenuInput;
        String studentMenuInput;
        int quizMinScore = 0;
        int quizMaxScore = 100;
        int maxNumQuizzes = 100;
        ArrayList<Integer> quizScores;
        
        Map<String, String> userMenu = new TreeMap<>();
        String userMenuExit = "5";
        userMenu.put("1", "View list of students");
        userMenu.put("2", "Add Student");
        userMenu.put("3", "Remove Student");
        userMenu.put("4", "Search for Student");
        userMenu.put(userMenuExit, "Exit");
        
        Map<String, String> studentMenu = new TreeMap<>();
        String studentMenuExit = "3";
        studentMenu.put("1", "View quiz scores");
        studentMenu.put("2", "View average quiz score");
        studentMenu.put(studentMenuExit, "Return");
        
        // Handle userMenu
        do{
            userMenuInput = userIO.readMenuString(userMenu);
            String studentName;
            
            switch (userMenuInput){
                
                // View list of students
                case "1":
                    sqg.printStudentList(userIO);
                    break;
                    
                // Add student
                case "2":
                    studentName = sqg.promptStudentName(userIO);
                    int numQuizScores = userIO.readInt("How many quiz scores do you have to enter? ", 1, maxNumQuizzes);
                    quizScores = new ArrayList<>();
                    for (int i = 0; i < numQuizScores; i++){
                        int quizScore = userIO.readInt("Enter score for quiz #" + (i+1) + ":", quizMinScore, quizMaxScore);
                        quizScores.add(quizScore);
                    }
                    sqg.addStudent(studentName, quizScores);
                    userIO.print("Student added.\n");
                    break;
                    
                // Remove student
                case "3":
                    studentName = sqg.promptStudentName(userIO);
                    if (sqg.removeStudent(studentName)){
                        userIO.print("Student removed.\n");
                    }
                    else{
                        userIO.print("Student not found.\n");
                    }
                    break;
                    
                // Search student
                case "4":
                    studentName = sqg.promptStudentName(userIO);
                    if (sqg.isStudent(studentName)){
                        
                        // Handle studentMenu
                        do{
                            userIO.print("");
                            studentMenuInput = userIO.readMenuString(studentMenu);
                            switch (studentMenuInput){
                                
                                // View quiz scores
                                case "1":
                                    quizScores = sqg.getStudentQuizScores(studentName);
                                    
                                    String title = "Quiz scores for " + studentName + " (" + quizScores.size() + "):";
                                    userIO.print(title);
                                    userIO.printHorizontalLine(title.length());
                                    
                                    for (int i = 0; i < quizScores.size(); i++){
                                        userIO.print("Quiz " + (i+1) + ": " + quizScores.get(i));
                                    }
                                    break;
                                    
                                // View average quiz score
                                case "2":
                                    userIO.print("Average Quiz Score for " + studentName + ": " + sqg.getStudentAverageQuizScore(studentName));
                                    break;
                                    
                                // Return to userMenu
                                case "3":
                                    break;
                            }
                        } while (!studentMenuInput.equals(studentMenuExit));
                    }
                    else{
                        userIO.print("Student not found.\n");
                    }
                    break;
                  
                // Exit program
                case "5":
                    break;
            }
        } while (!userMenuInput.equals(userMenuExit));
    }
    
    public boolean isStudent(String studentName){
        return this.studentQuizData.containsKey(studentName);
    }
    
    public String promptStudentName(UserIO userIO){
        return userIO.readString("Enter student name: ");
    }
    
    // Adds new student to system; Overwrites student if student already exists
    public void addStudent(String studentName, ArrayList<Integer> quizScores){
        this.studentQuizData.put(studentName, quizScores);
    }
    
    public boolean removeStudent(String studentName){
        if (this.isStudent(studentName)){
            this.studentQuizData.remove(studentName);
            return true;
        }
        else{
            return false;
        }
    }
    
    public Set<String> getStudentList(){
        return this.studentQuizData.keySet();
    }
    
    public void printStudentList(UserIO userIO){
        Set<String> studentList = this.getStudentList();
        String title = "Students (" + studentList.size() + "):";
        userIO.print(title);
        userIO.printHorizontalLine(title.length());
        for (String student: studentList){
            userIO.print(student);
        }
        userIO.print("");
    }
    
    public ArrayList<Integer> getStudentQuizScores(String studentName){
        return this.studentQuizData.get(studentName);
    }
    
    public float getStudentAverageQuizScore(String studentName){
        ArrayList<Integer> studentQuizScores = this.getStudentQuizScores(studentName);
        int quizScoreSum = 0;
        for (int quizScore : studentQuizScores){
            quizScoreSum += quizScore;
        }
        float averageQuizScore = ((float) quizScoreSum) / ((float) studentQuizScores.size());
        
        return averageQuizScore;
    }
    
}
