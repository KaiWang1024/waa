package mum.waa.lab11.service;

import mum.waa.lab11.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee e);

    public List<Employee> getAll();


}
