package org.cb.spring.services;

public class GreetingFactory {
    public IGreetingService getGreetingService(String lang) {
        switch (lang) {
            case "es":
                return new SpanishGreetingService();
            case "de":
                return new GermanGreetingService();
            case "en":
            default:
                return new EnglishGreetingService();
        }
    }
}
