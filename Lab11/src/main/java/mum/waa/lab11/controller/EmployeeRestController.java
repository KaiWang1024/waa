package mum.waa.lab11.controller;

import mum.waa.lab11.service.EmployeeService;
import mum.waa.lab11.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/ajax/post")
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

}
