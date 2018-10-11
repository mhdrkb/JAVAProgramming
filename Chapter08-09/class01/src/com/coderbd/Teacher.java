/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author Java
 */
public class Teacher {

///instance variable
    int id;
    String name;
    String eduQ;

    ///Create Default constructor(optional)
    //////
// generate main method   
    public static void main(String[] args) {
        ///creating object 01
        Teacher tech = new Teacher();
        ////set value
        tech.setId(2000);
        tech.setName("Mehedee");
        tech.setEduQ("BSc");
        System.out.println("ID: " + tech.getId() +"\n" + "Name: " + tech.getName() + "\n"+ "Educational Qualification : " + tech.getEduQ() +"\n");
        
///creating object 02
        Teacher tech2 = new Teacher();
        ////set value
        tech2.setId(2001);
        tech2.setName("Hasan");
        tech2.setEduQ("MSc");
        System.out.println("ID: " + tech2.getId() +"\n" + "Name: " + tech2.getName() + "\n"+ "Educational Qualification : " + tech2.getEduQ() +"\n");
    }

    ///print and get or generate getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEduQ() {
        return eduQ;
    }

////setter method
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEduQ(String eduQ) {
        this.eduQ = eduQ;
    }

}
