package edu.mum.controller;

import edu.mum.domain.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {

    @RequestMapping({"/", "/calculator"})
    public String calculator() {
        return "calculator";
    }

    @RequestMapping(value = "doCalculate", method = RequestMethod.POST)
    public String doCalc(Calculator calculator, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("calculator", calculator);
        redirectAttributes.addFlashAttribute("greeting", "Hello World!");
        return "redirect:/result";
    }

    @RequestMapping("/result")
    public String getResult() {
        return "result";
    }
}
