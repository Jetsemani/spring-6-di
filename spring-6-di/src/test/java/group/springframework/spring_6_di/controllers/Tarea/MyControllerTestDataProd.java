package group.springframework.spring_6_di.controllers.Tarea;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("PROD")
@SpringBootTest
public class MyControllerTestDataProd {

    @Autowired
    DataSourceController dataSourceController;

    @Test
    void sayHello() {
        System.out.println(dataSourceController.sayHello());
    }
}
