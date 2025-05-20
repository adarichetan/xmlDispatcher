package com.dss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionAttributesPractise {

    @PostMapping("/test")
    public String test(Model model) {
        Model model1 = model.addAttribute("as", "asf");
        System.out.println(model);
        return "test completed";
    }

    @PostMapping("/test2")
    public String test2(@ModelAttribute("as") String as) {
        System.out.println("value from session: " + as);
        return "test";
    }


}