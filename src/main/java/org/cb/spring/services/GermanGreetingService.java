package org.cb.spring.services;

public class GermanGreetingService implements IGreetingService {
    @Override
    public String greet() {
        return "Hallo";
    }
}
