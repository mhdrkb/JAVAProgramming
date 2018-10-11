package com.mhd.inherit;

import com.mhd.*;

public class ClassA {

    int id;
    String name;
    String color;

    public ClassA() {
    }

    public ClassA(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public void sayHello() {
        System.out.println("HI, how are you..?");
    }

}
