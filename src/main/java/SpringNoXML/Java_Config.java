package SpringNoXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Java_Config {
    @Bean
    public Student getStudent(){
        Student student = new Student();

        return student;
    }
}
