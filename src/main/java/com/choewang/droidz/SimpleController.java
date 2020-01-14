package com.choewang.droidz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/h")
    public String homePage(Model model){
        model.addAttribute("appName", appName);
        return "home";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}
