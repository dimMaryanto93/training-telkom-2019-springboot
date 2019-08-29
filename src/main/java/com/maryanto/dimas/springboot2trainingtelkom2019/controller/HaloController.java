package com.maryanto.dimas.springboot2trainingtelkom2019.controller;

import com.maryanto.dimas.springboot2trainingtelkom2019.model.Mahasiswa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HaloController {

    @GetMapping("/halo")
    public String halo(
            Model model,
            @ModelAttribute Mahasiswa mahasiswa) {
        model.addAttribute("mahasiswa", mahasiswa);
        return "belajar-html";
    }

    @GetMapping("/haloPost")
    public String requestGet(
            @RequestParam(required = false) String nama,
            @RequestParam(required = false) Integer umur) {
        System.out.println("nama dari request " + nama + ", umur dari request = " + umur);
        return "redirect:/halo";
    }

    @PostMapping("/haloPost")
    public String requestPost(
            @RequestParam(required = false) String nama,
            @RequestParam(required = false) Integer umur) {
        System.out.println("nama dari request " + nama + ", umur dari request = " + umur);
        return "redirect:/halo";
    }
}
