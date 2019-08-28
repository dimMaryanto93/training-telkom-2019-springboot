package com.maryanto.dimas.springboot2trainingtelkom2019.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassF {

    @Value("nama saya dimas maryanto")
    String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
