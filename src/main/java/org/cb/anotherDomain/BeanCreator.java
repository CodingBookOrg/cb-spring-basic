package org.cb.anotherDomain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreator {
    @Bean
    public Student getStudent() {
        Student student = new Student();
        student.setId(100l);
        return student;
    }

}
