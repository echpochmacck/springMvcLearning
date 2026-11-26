package com.maxim.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
       return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails() {
        return "askEmpDetailsView";
    }
    @RequestMapping("/showDetails")
    public String showEmpDetails() {
        return "showEmpDetailsView";
    }

}
