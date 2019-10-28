package ru.tustik.oomg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateJobController {
    @GetMapping("/create")
    public String create(Model model) {
        return "create";
    }
}
