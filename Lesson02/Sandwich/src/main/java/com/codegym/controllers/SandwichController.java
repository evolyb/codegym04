package com.codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @RequestMapping("/form")
    public String showForm(){
        return "condimentsForm";
    }
    @RequestMapping("/save")
    public String save(@RequestParam ("condiment") String[] condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "info";
    }
}
