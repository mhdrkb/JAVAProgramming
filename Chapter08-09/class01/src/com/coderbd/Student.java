package com.coderbd;

public class Student {
    //////instance variables
    int id;
    String name;
    
    //////#######creating constructors
    
    //////default constructors
    public Student() {
    }
    
    
    ////////setter method
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    ///////////main method
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.setId(1000);
       s1.setName("Mr.AAAAAAA");
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

    
}