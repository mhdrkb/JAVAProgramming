
package com.mhd.inherit;

import com.mhd.*;

public class Test {
    public static void main(String[] args) {
        ClassB b1 = new ClassB(); //b1 is the object of reference ClassB 
        ClassA b2 = new ClassB(); //b2 is the object of reference ClassA
        ClassA a1 = new ClassA(); //a1 is the object of reference ClassA
        
        
        //////////BUT---//////////
        //ClassB a2 = new ClassA();  ///Wrong...! child class can not be reference of main class
        ClassC c1 =new ClassC();
        ClassB c2 =new ClassC();
        ClassA c3 =new ClassC();
        System.out.println(b1 instanceof ClassB);
        System.out.println(b2 instanceof ClassA);
        System.out.println(a1 instanceof ClassA);
        System.out.println(a1 instanceof ClassB);
        System.out.println(c1 instanceof ClassC);
        System.out.println(c2 instanceof ClassC);
        System.out.println(c3 instanceof ClassC);
        
    }
}
