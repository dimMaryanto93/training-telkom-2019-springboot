package com.maryanto.dimas.springboot2trainingtelkom2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class HaloController {

    @GetMapping("/halo")
    public String halo(
            Model model,
            @RequestParam(required = false) String nama,
            @RequestParam(required = false) Integer umur) {
        model.addAttribute("tanggal", new Date());
        model.addAttribute("message", "Halo ini dari bahasa indonesia");
        System.out.println("nama dari request " + nama + ", umur dari request = " + umur);
        return "belajar-html";
    }
}
