package com.example.demo.services.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

// Doing this allows JPA to do all the hard tedious database interactions
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
