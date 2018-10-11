package com.mhd.inherit;

import com.mhd.*;

public class ClassB extends ClassA { ///extend  keyword is used to inherit classes
    double salary;

    public ClassB() {
    }

    public ClassB(double salary) {
        this.salary = salary;
    }

    public ClassB(double salary, int id, String name, String color) {
        super(id, name, color);
        this.salary = salary;
    }
    
    
}
