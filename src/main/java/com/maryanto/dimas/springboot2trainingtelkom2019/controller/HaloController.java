package com.maryanto.dimas.springboot2trainingtelkom2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HaloController {

    @GetMapping("/halo")
    public String halo(Model model) {
        model.addAttribute("tanggal", new Date());
        model.addAttribute("message", "Halo ini dari bahasa indonesia");
        return "belajar-html";
    }
}
