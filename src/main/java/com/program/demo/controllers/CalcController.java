package com.program.demo.controllers;

import com.program.demo.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalcController {

    @GetMapping("/calc")
    public String calcMain(Model model) {
        return "calc_main";
    }

    @GetMapping("/calc/calculator")
    public String calcCalculator(Model model) {
        return "calculator";
    }
}
