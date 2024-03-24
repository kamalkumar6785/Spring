package task4.ques4.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"task4.ques4.assignment","service"})
public class AppConfig {
    @Bean
    public Sum sum() {
    	return new Sum();
    }
}
