package com.maryanto.dimas.springboot2trainingtelkom2019.di;

import org.springframework.stereotype.Component;

@Component
public class ClassC {

    public ClassC(ClassD d) {
        this.d = d;
    }

    private ClassD d;

    public ClassD getD() {
        return d;
    }

    public void setD(ClassD d) {
        this.d = d;
    }
}
