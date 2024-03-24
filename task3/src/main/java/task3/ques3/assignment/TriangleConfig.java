package task3.ques3.assignment;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="task3.ques3.assignment")
public class TriangleConfig{
	
	@Bean
    public Triangle triangle() {
		// setting base and height of the triangle
        return new Triangle(5, 14);
    }
	
}