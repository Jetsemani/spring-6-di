package group.springframework.spring_6_di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service";
    }
}
