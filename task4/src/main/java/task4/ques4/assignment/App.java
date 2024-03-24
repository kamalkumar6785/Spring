package task4.ques4.assignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Task 4 : ");
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Sum sum = context.getBean(Sum.class);
        sum.setNum1(1130300000);
        sum.setNum2(100000000);
        
        sum.sum();
        
        context.close();
    }
}