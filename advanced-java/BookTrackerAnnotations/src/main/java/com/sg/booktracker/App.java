package com.sg.booktracker;

import com.sg.booktracker.controller.BookController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Kyle David Rudy
 */
public class App {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext appContext = 
                new AnnotationConfigApplicationContext();
        
        // Typically want to start scanning from the package your App is in
        appContext.scan("com.sg.booktracker");
        /*
        Spring checks all classes it can find in the above package and any child
        packages for annotations. Anything that is a @Component is created in
        memory with dependencies injected where it sees @Autowired.
        */
        appContext.refresh();
        
        /*
        Since we didn't set any IDs for our classes when we annotated them, 
        their default IDs are their names converted to camel-case.
        */
        BookController controller = 
                appContext.getBean("bookController", BookController.class);
        
        controller.run();
    }
}
