package org.example.springJpa.service;


import org.example.springJpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}

