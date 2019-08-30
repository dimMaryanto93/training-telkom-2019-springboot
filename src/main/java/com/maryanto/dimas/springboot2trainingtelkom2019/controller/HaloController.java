package com.maryanto.dimas.springboot2trainingtelkom2019.controller;

import com.maryanto.dimas.springboot2trainingtelkom2019.MahasiswaRepository;
import com.maryanto.dimas.springboot2trainingtelkom2019.model.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HaloController {

    @Autowired
    private MahasiswaRepository repo;

    @GetMapping("/halo")
    public String halo(
            Model model,
            @ModelAttribute Mahasiswa mahasiswa) {
        model.addAttribute("mahasiswa", mahasiswa);
        Iterable<Mahasiswa> all = repo.findAll();
        model.addAttribute("listMahasiswa", all);
        return "belajar-html";
    }

    @PostMapping("/haloPost")
    public String requestPost(
            @RequestParam(required = false) String nama,
            @RequestParam(required = false) Integer umur) {
        repo.save(new Mahasiswa(null, nama, umur));
//        save to database
        return "redirect:/halo";
    }
}
