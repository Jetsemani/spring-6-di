package group.springframework.spring_6_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary//--Sin Primary->Error=expected single matching bean but found 2: greetingServiceImpl,greetingServicePrimary
@Service
public class GreetingServicePrimary implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean!!";
    }
}
