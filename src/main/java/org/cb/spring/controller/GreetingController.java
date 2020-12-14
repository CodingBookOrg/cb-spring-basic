package org.cb.spring.controller;

import org.cb.spring.services.IGreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class GreetingController {


    private  final IGreetingService greetingService;

    public GreetingController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(value = "greet", method = RequestMethod.GET)
    public ResponseEntity greet() {
        System.out.println(greetingService.greet());
        return new ResponseEntity(HttpStatus.OK);
    }
}
