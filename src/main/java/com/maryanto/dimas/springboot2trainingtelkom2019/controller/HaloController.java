package com.maryanto.dimas.springboot2trainingtelkom2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HaloController {

    @GetMapping("/halo")
    public String halo(
            Model model,
            @RequestParam(required = false) String nama,
            @RequestParam(required = false) Integer umur) {
        model.addAttribute("nama", nama);
        model.addAttribute("umur", umur);
        System.out.println("nama dari request " + nama + ", umur dari request = " + umur);
        return "belajar-html";
    }
}
