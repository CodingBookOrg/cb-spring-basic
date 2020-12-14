package org.cb.spring.config;

import org.cb.spring.services.GreetingFactory;
import org.cb.spring.services.IGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingFactory getGreetingFactory() {
        return new GreetingFactory();
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    public IGreetingService getPrimaryGreetingService(GreetingFactory greetingFactory) {
        return greetingFactory.getGreetingService("en");
    }

    @Bean
    @Profile({"default", "es"})
    public IGreetingService getESPrimaryGreetingService(GreetingFactory greetingFactory) {
        return greetingFactory.getGreetingService("es");
    }

    @Bean
    @Profile({"default", "de"})
    public IGreetingService getDEPrimaryGreetingService(GreetingFactory greetingFactory) {
        return greetingFactory.getGreetingService("de");
    }
}
