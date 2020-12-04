package org.cb.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//be careful you are adding this class' package in component scan too
@ComponentScan(basePackages = {"org.cb.anotherDomain", "org.cb.spring"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
