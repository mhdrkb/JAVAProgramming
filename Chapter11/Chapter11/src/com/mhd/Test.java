package com.mhd;
public class Test {
    public static void main(String[] args) {
        ClassB b1 = new ClassB(); //b1 is the object of reference ClassB 
        ClassA b2 = new ClassB(); //b2 is the object of reference ClassA
        ClassA a1 = new ClassA(); //a1 is the object of reference ClassA
        
        
        //////////BUT---//////////
        //ClassB a2 = new ClassA();  ///Wrong...! child class can not be reference of main class
    }
}
