package task2.ques2.assignment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Task  2 : ");
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        map obj = context.getBean("map", map.class);
        obj.print();
    }
}