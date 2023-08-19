package ru.mngerasimenko.employee.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) throws NoSuchFieldException {
		Employee employee = service.getById(id);
		if (employee == null) {
			throw new NoSuchFieldException("There is no employee with ID = " + id + " in database");
		}

		return employee;
	}
}
