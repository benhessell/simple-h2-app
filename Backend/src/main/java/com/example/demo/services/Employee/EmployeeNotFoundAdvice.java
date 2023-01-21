package com.example.demo.services.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody // This signals this advice is rendered straight into the response body
    @ExceptionHandler(com.example.demo.services.Employee.EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(com.example.demo.services.Employee.EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
