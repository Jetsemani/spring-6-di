package group.springframework.spring_6_di.services.Tarea;

import group.springframework.spring_6_di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class QaGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Qa";
    }
}
