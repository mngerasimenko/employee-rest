package ru.mngerasimenko.employee.rest.service;

import ru.mngerasimenko.employee.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

	List<Employee> getAll();

	void save(Employee employee);

	Employee getById(int id);

	void delete(int id);
}
