package edu.mum.controller;

import com.sun.deploy.util.SessionState;
import edu.mum.domain.DataFacade;
import edu.mum.domain.DataFacadeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Arrays;
import java.util.List;

@Controller
@SessionAttributes({"username"})
public class AuthenticationController {

    @Autowired
    DataFacadeFactory dataFactory;

    @RequestMapping(value = "/action/login", method = RequestMethod.GET)
    public String advice(Model model) {
        List<String> opt0 = Arrays.asList("-", "--Choose Roast--");
        List<String> opt1 = Arrays.asList("dark", "Dark");
        List<String> opt2 = Arrays.asList("medium", "Medium");
        List<String> opt3 = Arrays.asList("light", "Light");
        List<List<String>> options = Arrays.asList(opt0, opt1, opt2, opt3);
        model.addAttribute("options", options);
        return "advice";
    }

    @RequestMapping(value = "/action/login", method = RequestMethod.POST)
    public String doLogin(@RequestParam("name") String name,
                          @RequestParam("password") String password,
                          Model model) {
        DataFacade data = dataFactory.getDataFacadeInstance("dev");
        String expectedPassword = data.findPassword(name );

        if(expectedPassword == null || !expectedPassword.equals(password)) {
            return "index";
        } else {
            model.addAttribute("username", name);
            return "LoginSuccessful";
        }
    }

    @RequestMapping(value = "/action/logout", method = RequestMethod.GET)
    public String doLogout(SessionStatus status) {
        status.setComplete();
        return "redirect:/";
    }

}
