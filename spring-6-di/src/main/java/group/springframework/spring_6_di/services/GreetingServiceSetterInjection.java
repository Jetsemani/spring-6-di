package group.springframework.spring_6_di.services;

import org.springframework.stereotype.Service;

@Service("setterGettingBean")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I´m Settinga Gretting!!";
    }
}
