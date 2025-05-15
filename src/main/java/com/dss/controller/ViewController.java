package com.dss.controller;

import com.dss.controller.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*@RequestMapping("/api")*/
public class ViewController {

    @GetMapping("/test")
    public ModelAndView hello(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");

        int num3 = num1 + num2;
        mv.addObject("num3", num3);
        return mv;
    }

    @GetMapping("/asf")
    public String hellowf() {
        return "test";
    }
/*
    @GetMapping("/person")
    public String getPersonDetails(@RequestParam("num1")int age, @RequestParam("num2") String name , Model model){
        Person person = new Person();
        person.setAge(age);
        person.setName(name);

        model.addAttribute("person", person);
        return "person";
    }*/

    @PostMapping("/person")
    public String getPersonDetails(@ModelAttribute Person a) {
        return "person";
    }

    @GetMapping("/")
    public String hellow() {
        return "index";
    }


    @GetMapping("/{id}")
    public String getPerson(@PathVariable("id") Long id) {
        return "var";
    }

/*    @PostMapping("/person")
    @ResponseBody
    public String getPersonDetails(@RequestBody Person a) {
        return "Received: " + a.getName() + ", Age: " + a.getAge();
    }*/

}