package group.springframework.spring_6_di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayhello() {
        System.out.println("I´m in the controller");

        return "Hello Everyone!!!";
    }
}
