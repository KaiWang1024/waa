package controller;

import domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import validator.Validator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@mum.edu.framework.annotation.Controller
public class CalculatorController {
    @AutoWired
    Validator calculatorValidator;

    @RequestMapping(value = {"/", "/calculator"})
    public String calculator() {
        System.out.println("calculator page");
        return "/WEB-INF/calculator.jsp";
    }

    @RequestMapping(value = {"/doCalculate"})
    public String doCalc(Calculator calculator, HttpServletRequest request) {
        List<String> errors = calculatorValidator.validate(calculator);

        if (errors.isEmpty()) {
            // no validation error, execute action method
            // insert code to save product to the database

            // store product in a scope variable for the view
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/result.jsp";
        } else {

            // store errors and product in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/result.jsp";
        }
    }
}
