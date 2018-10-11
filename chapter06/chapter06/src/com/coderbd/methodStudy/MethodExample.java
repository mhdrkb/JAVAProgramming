/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.methodStudy;

/**
 *
 * @author Java
 */
public class MethodExample {
    
    static String abc;
    static String msg = "Mehedee";
    
    //////////////void type
    //method 01
    public void display1(){
    
        //nothing to return
    }
    
    
    ///////////////////Integer type
    //method 02,Data type int so we must need a int type data to return with a return keyword
    public int display2(){
        
    return 0; //here 0 is int type data that is returned .
    }
    
   
    
/////////////////String type
//method 02,Data type String so we must need a string type data to return with a return keyword
    public String display3(){    
    return null; //here null is String type data .
    }
    public static String display4(){
    return "Hello World"; //here is String type data .
    }
    public static String display5(){
        String str = "Hello Programers";
    return str; //here str is String type data .
    }
    public static String display6(){
        abc = "Hello Friends."; //as this method is static so the variables must need to be static
    return abc; //here abc is String type data .
    }
    public static String display7(){  
        //as this method is static so the variables must need to be static
    return msg; //here msg is String type data .
    }
    
    
    /////////constructorssss
    //1.Default constructorssss
    public MethodExample(){
    }
    //2.Argumentative constructorssss
    public MethodExample(String x){
        this.abc=x;
    }
    
    ////////main method and method calling
    public static void main(String[] args) {
        
        
        ///method calling
        System.out.println("====================Way 1================");
        System.out.println(display4()); //as main method is static so every called method must need to be static
        System.out.println(display5()); //as main method is static so every called method must need to be static
        System.out.println(display6()); //as main method is static so every called method must need to be static
        System.out.println(display7()); //as main method is static so every called method must need to be static
        
        
        ///again calling way 2
        System.out.println("====================Way 2================");
        String m1 = display4();
        System.out.println(m1);
        String m2 = display5();
        System.out.println(m2);
        String m3 = display6();
        System.out.println(m3);
        String m4 = display7();
        System.out.println(m4);
        ///again calling way 3 with creating constructor
        System.out.println("====================Way 3================");
        ////////calling methods with creating object of the class and calling as the propertise of the object
        
        MethodExample objname = new MethodExample();
        System.out.println("Method-04 : "+ MethodExample.display4());///without using objects
        System.out.println("Method-05 : "+ objname.display5());
        System.out.println("Method-05 : "+ objname.display7());
    }
}
