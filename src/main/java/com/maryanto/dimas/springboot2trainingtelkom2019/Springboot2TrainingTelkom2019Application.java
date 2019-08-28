package com.maryanto.dimas.springboot2trainingtelkom2019;

import com.maryanto.dimas.springboot2trainingtelkom2019.di.*;

public class Springboot2TrainingTelkom2019Application {

    public static void main(String[] args) {
        ClassF f = new ClassF();
        f.setNama("Nama saya dimas maryanto");
        ClassE e = new ClassE();
        ClassD d = new ClassD(e, f);
        ClassC c = new ClassC(d);
        ClassB b = new ClassB(c, d);
        ClassA a = new ClassA(b);

        System.out.println("f nama "+ a.getB().getC().getD().getF().getNama());

    }

}
