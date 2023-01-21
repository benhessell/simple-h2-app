package com.example.demo.services.Employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//restController indicates that the data returned by each method will be written
// straight into the response body instead of rendering a template
@RestController
public class EmployeeController {

    //EmployeeRepository is injected by the constructor into the controller
    // i.e. it isnt getting instantiated - Dependency Injection
    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    @GetMapping("/api/employees/{id}")
    Employee one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/api/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @PutMapping("/api/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/api/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
