package com.maxim.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
       return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {
        model.addAttribute("emp", new Employee());
        return "askEmpDetailsView";
    }
//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "showEmpDetailsView";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String name = request.getParameter("employeeName");
//        name = "MR " + name;
//        model.addAttribute("name", name);
//        return "showEmpDetailsView";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String name, Model model) {
//        name = "MR " + name;
//        model.addAttribute("name", name);
//        return "showEmpDetailsView";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("emp") Employee emp) {
        return "showEmpDetailsView";
    }

}
