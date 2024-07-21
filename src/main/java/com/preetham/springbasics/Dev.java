package com.preetham.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    Machine machine;

    public void code(){
        machine.runCode();
        System.out.println("THis is a new project to learn Spring boot");
    }

}
