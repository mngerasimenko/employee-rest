package ru.mngerasimenko.employee.rest.dao;

import ru.mngerasimenko.employee.rest.entity.Employee;

import java.util.List;


public interface EmployeeDAO {
	List<Employee> getAll();

	void save(Employee employee);

	Employee getById(int id);

	void delete(int id);
}
