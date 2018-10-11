/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhd.inheritExtends;

/**
 *
 * @author Java
 */
public class Test {
    public static void main(String[] args) {
        ClassP a = new ClassP();
        ClassQ b1 = new ClassQ(); //ClassQ creates an object b1 reference from ClassQ
        ClassP b2 = new ClassQ(); //ClassQ creates an object b1 reference from ClassP
        
        
        
        a.sayHello();
        b1.sayHello();
        b2.sayHello();
        b1.sayHi();
    }
    
}
