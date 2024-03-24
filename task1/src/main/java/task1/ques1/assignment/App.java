package task1.ques1.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Printing task information
        System.out.println("Task 1 :: ");
        
        // Creating the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        // Retrieving the 'map' bean from the context
        map obj = context.getBean("map", map.class);
        
        // Calling the print method of the 'map' object
        obj.print();
    }
}
