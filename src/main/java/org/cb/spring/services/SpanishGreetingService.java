package org.cb.spring.services;

public class SpanishGreetingService implements IGreetingService {
    @Override
    public String greet() {
        return "Hola";
    }
}
