package group.springframework.spring_6_di.controllers;

import group.springframework.spring_6_di.services.GreetingService;
import group.springframework.spring_6_di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayhello() {
        System.out.println("I´m in the controller");

        return greetingService.sayGreeting();
    }
}
