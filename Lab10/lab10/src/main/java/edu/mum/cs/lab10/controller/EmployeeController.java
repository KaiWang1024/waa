package edu.mum.cs.lab10.controller;

import edu.mum.cs.lab10.domain.Address;
import edu.mum.cs.lab10.domain.Employee;
import edu.mum.cs.lab10.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String getEmployeeForm(@ModelAttribute("emp")Employee employee, Model model){
        return "employeeForm";
    }


    @PostMapping("/")
    public String saveEmployee(@Valid @ModelAttribute("emp")Employee employee, BindingResult result,
                               RedirectAttributes redirectAttributes, Model model){
        if(result.hasErrors()){
            return "employeeForm";
        }else{
            Address address = new Address(employee.getAddress().getStreet(), employee.getAddress().getZipCode());
            employee.setAddress(address);
            address.setEmployee(employee);
            employeeService.saveEmployee(employee);

//            redirectAttributes.addFlashAttribute("employeeList", employeeService.getAll());
            return "redirect:/list";
        }
    }

    @GetMapping("/details")
    public String getEmployeeDetails(){
        return "employeeDetails";
    }

    @GetMapping("/list")
    public String getEmployeeList(Model model){
        model.addAttribute("employeeList", employeeService.getAll());
        return "employeeList";
    }

    @GetMapping("/ajax/get")
    public String getEmployeeFormAjax(){
        return "employeeFormAjax";
    }




}
