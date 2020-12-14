package org.cb.spring.services;

public class EnglishGreetingService implements IGreetingService {
    @Override
    public String greet() {
        return "Hello";
    }
}
