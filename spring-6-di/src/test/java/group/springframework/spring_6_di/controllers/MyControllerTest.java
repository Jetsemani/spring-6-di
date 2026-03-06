package group.springframework.spring_6_di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void sayhello() {
        MyController myController = new MyController();

        System.out.println(myController.sayhello());
    }
}