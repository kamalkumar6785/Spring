package task3.ques3.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;



@Component
public class App 
{
	private Triangle triangle;
	
	@Autowired
	public App(Triangle triangle) {
		this.triangle = triangle;
	}
	
    public static void main( String[] args ){
    	System.out.println("Task 3 : ");

        ApplicationContext context = new AnnotationConfigApplicationContext(TriangleConfig.class);
        
        App obj = context.getBean(App.class);
        System.out.println("Area of the triangle is : " + obj.triangle.calculateArea() + " sq unit");
    }
}



