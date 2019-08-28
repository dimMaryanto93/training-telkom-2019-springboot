package com.maryanto.dimas.springboot2trainingtelkom2019.di;

import org.springframework.stereotype.Component;

@Component
public class ClassA {

    public ClassA(ClassB b) {
        this.b = b;
    }

    private ClassB b;

    public ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }
}
