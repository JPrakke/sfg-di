package com.JPrakke.sfgdi.controllers;


import com.JPrakke.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

//    Constructor, what, where, when, why?
    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

}
