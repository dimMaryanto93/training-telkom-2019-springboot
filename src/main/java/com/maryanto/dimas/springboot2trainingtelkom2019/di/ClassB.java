package com.maryanto.dimas.springboot2trainingtelkom2019.di;

import org.springframework.stereotype.Component;

@Component
public class ClassB {

    public ClassB(ClassC c, ClassD d) {
        this.c = c;
        this.d = d;
    }

    private ClassC c;
    private ClassD d;

    public ClassC getC() {
        return c;
    }

    public void setC(ClassC c) {
        this.c = c;
    }

    public ClassD getD() {
        return d;
    }

    public void setD(ClassD d) {
        this.d = d;
    }
}
