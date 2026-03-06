package group.springframework.spring_6_di.controllers;

import group.springframework.spring_6_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService)
    {
        System.out.println("###############Setter ejecutado###############");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Say Hello ejecutado");
        return greetingService.sayGreeting();
    }
}
