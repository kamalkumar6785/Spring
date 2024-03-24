package task4.ques4.assignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Task 4 : ");
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Mult mult_obj = context.getBean(Mult.class);
        mult_obj.setNum1(50);
        mult_obj.setNum2(2);
        
        mult_obj.Mult();
        
        context.close();
    }
}