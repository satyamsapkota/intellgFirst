package com.may2022.batch.rest.demo.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//http://localhost:8085/greeting?name=Sunny

@Controller
public class GreetingController {
    @GetMapping("/abc")
    public String greetings(@RequestParam(name = "name", required = false
            , defaultValue = "World") String name, @NotNull Model model) {

        model.addAttribute("name", name);

        return "greetings";
    }
}
