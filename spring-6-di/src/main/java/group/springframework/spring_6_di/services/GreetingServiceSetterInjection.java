package group.springframework.spring_6_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("setterGettingBean")
@Profile("default")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I´m Settinga Gretting!!";
    }
}
