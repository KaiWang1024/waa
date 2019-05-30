package edu.mum.controller;

import edu.mum.domain.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {

    @RequestMapping({"/", "/calculator"})
    public String calculator() {
        return "calculator";
    }

    @RequestMapping(value = "doCalculate", method = RequestMethod.POST)
    public String doCalc(Calculator calculator, Model model) {
        model.addAttribute("calculator", calculator);
        return "result";
    }
}
