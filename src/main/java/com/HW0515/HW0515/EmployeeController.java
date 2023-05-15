package com.HW0515.HW0515;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping(path = " /employee/add")
    public String addEmployee(@RequestParam("firstName") String fistName, @RequestParam("lastName") String lastName) {
        final String employee;
        employee = service.getEmployee(fistName,lastName);
        return employee;
    }
}
