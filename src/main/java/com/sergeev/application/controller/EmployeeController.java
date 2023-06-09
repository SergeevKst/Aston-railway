package com.sergeev.application.controller;

import com.sergeev.application.entity.Employee;
import com.sergeev.application.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping()
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
    }
}
