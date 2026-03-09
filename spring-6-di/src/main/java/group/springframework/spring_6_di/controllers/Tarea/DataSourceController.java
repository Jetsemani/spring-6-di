package group.springframework.spring_6_di.controllers.Tarea;

import group.springframework.spring_6_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final GreetingService greetingService;

    public DataSourceController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
