package com.example.demo;

import com.example.demo.services.Employee.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(classes = Employee.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerIT {

    @LocalServerPort
    public int port;

    @Test
    public void test() {
        String url = "heep://localhost:" + port + "/api/employees";

        TestRestTemplate restTemplate = new TestRestTemplate();

        String output = restTemplate.getForObject(url, String.class);

        System.out.println("Response: " + output);
    }
}
