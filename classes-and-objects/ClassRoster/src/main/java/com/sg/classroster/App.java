/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 29, 2021
 * purpose: 
 */

package com.sg.classroster;

import com.sg.classroster.controller.ClassRosterController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Austin Wong
 */
public class App {
    public static void main(String[] args){
//        UserIO myIo = new UserIOConsoleImpl();
//        ClassRosterView myView = new ClassRosterView(myIo);
//        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
//        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
//        ClassRosterServiceLayer myService = 
//                new ClassRosterServiceLayerImpl(myDao, myAuditDao);
//        ClassRosterController controller = 
//                new ClassRosterController(myService, myView);
//        controller.run();

        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassRosterController controller =
                ctx.getBean("controller", ClassRosterController.class);
        controller.run();

    }
}