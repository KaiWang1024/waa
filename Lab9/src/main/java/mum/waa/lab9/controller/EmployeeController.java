package mum.waa.lab9.controller;

import mum.waa.lab9.domain.Employee;
import mum.waa.lab9.exception.EmployeeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping({"/","/employee"})
public class EmployeeController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String display() {
		
		return "employee";
	}
		
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody
    Employee add(@Valid @RequestBody Employee employee)  throws EmployeeException{

		if (employee.getFirstName().equals("Ex")) {
			throw new EmployeeException(employee.getEmail(), "Unable to save employee with email: ");
		}
			
		return employee;
	}
	

	
	
}
