/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 29, 2021
 * purpose: 
 */

package com.sg.classroster;

import com.sg.classroster.controller.ClassRosterController;

/**
 *
 * @author Austin Wong
 */
public class App {
    public static void main(String[] args){
        ClassRosterController controller = new ClassRosterController();
        controller.run();
    }
}
