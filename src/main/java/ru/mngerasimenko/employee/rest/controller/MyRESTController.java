package ru.mngerasimenko.employee.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mngerasimenko.employee.rest.entity.Employee;
import ru.mngerasimenko.employee.rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    private final EmployeeService service;

    @Autowired
    public MyRESTController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<Employee> showAll() {
        return service.getAll();
    }

}
