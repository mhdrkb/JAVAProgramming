package com.mhd.inherit;
public class ClassC extends ClassB{
    String department;

    public ClassC() {///default constructor of ClassC
    }

    public ClassC(String department) {//argumented constructor of ClassC
        this.department = department;
    }

    public ClassC(String department, double salary) { //Argumented constructor of ClassC inheriting ClassB only
        super(salary);
        this.department = department;
    }

    //Argumented constructor of ClassC inheriting ClassB and then extending the properties of ClassA via ClassB
    public ClassC(String department, double salary, int id, String name, String color) {
        super(salary, id, name, color);
        this.department = department;
    }
    
}
