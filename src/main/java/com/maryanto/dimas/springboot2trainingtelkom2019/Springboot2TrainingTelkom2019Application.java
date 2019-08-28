package com.maryanto.dimas.springboot2trainingtelkom2019;

import com.maryanto.dimas.springboot2trainingtelkom2019.di.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot2TrainingTelkom2019Application {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(Springboot2TrainingTelkom2019Application.class, args);

        ClassC a = context.getBean(ClassC.class);
        System.out.println("f nama "+
                a.getD().getF().getNama());

    }

}
