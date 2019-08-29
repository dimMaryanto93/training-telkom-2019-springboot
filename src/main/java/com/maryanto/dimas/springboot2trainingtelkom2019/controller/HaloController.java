package com.maryanto.dimas.springboot2trainingtelkom2019.controller;

import com.maryanto.dimas.springboot2trainingtelkom2019.model.Mahasiswa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HaloController {

    public HaloController() {
        this.daftarMahasiswa.add(new Mahasiswa("Dimas Maryanto", 15));
        this.daftarMahasiswa.add(new Mahasiswa("Mahasiswa 1", 15));
        this.daftarMahasiswa.add(new Mahasiswa("Mahasiswa 2", 15));
        this.daftarMahasiswa.add(new Mahasiswa("Mahasiswa 3", 15));
    }

    private List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    @GetMapping("/halo")
    public String halo(
            Model model,
            @ModelAttribute Mahasiswa mahasiswa) {
        model.addAttribute("mahasiswa", mahasiswa);
        model.addAttribute("listMahasiswa", daftarMahasiswa);
        return "belajar-html";
    }

    @PostMapping("/haloPost")
    public String requestPost(
            @RequestParam(required = false) String nama,
            @RequestParam(required = false) Integer umur) {
        System.out.println("nama dari request " + nama + ", umur dari request = " + umur);
//        save to database
        return "redirect:/halo";
    }
}
