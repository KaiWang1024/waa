package edu.mum.controller;

import edu.mum.domain.DataFacade;
import edu.mum.domain.DataFacadeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/action/login")
public class AuthenticationController {

    @Autowired
    DataFacadeFactory dataFactory;

    @GetMapping()
    public String advice(Model model) {
        List<String> opt0 = Arrays.asList("-", "--Choose Roast--");
        List<String> opt1 = Arrays.asList("dark", "Dark");
        List<String> opt2 = Arrays.asList("medium", "Medium");
        List<String> opt3 = Arrays.asList("light", "Light");
        List<List<String>> options = Arrays.asList(opt0, opt1, opt2, opt3);
        model.addAttribute("options", options);
        return "advice";
    }

    @PostMapping()
    public String doLogin(@RequestParam("name") String name,
                          @RequestParam("password") String password) {
        DataFacade data = dataFactory.getDataFacadeInstance("dev");
        String expectedPassword = data.findPassword(name );

        if(expectedPassword == null || !expectedPassword.equals(password)) {
            return "index";
        } else {
            return "LoginSuccessful";
        }
    }

}
