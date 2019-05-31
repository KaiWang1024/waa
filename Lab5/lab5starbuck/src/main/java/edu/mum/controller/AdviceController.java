package edu.mum.controller;

import edu.mum.domain.DataFacade;
import edu.mum.domain.DataFacadeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/action/advice")
@SessionAttributes({"user"})
public class AdviceController {

    @Autowired
    public DataFacadeFactory dataFactory;

    @RequestMapping
    public String getAdvices(@RequestParam("roast") String roast, Model model) {

        DataFacade data = dataFactory.getDataFacadeInstance("dev");
        List<String> advice = data.getAdvice(roast);
        model.addAttribute("roast", roast.toUpperCase());
        model.addAttribute("advice", advice);
        return "display";

    }
}
