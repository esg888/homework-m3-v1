package com.example.homework_m2_v2.config;
import com.example.homework_m2_v2.StudWork;
import com.example.homework_m2_v2.StudentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.homework_m2_v2")

public class DefaultRegAppConfig {

//@Bean
//    public StudWork studWork(StudentService studentService, ApplicationEventPublisher publisher)
//{
//    return new StudWork(studentService, publisher);
//}


}
