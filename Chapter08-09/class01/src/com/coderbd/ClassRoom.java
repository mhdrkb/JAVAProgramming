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
public class ClassRoom {

    int id;
    String location;

    /////having constructor
    ////you must take a default constructor to create a argumentative constructor
    public ClassRoom() {
    }

    public ClassRoom(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public static void main(String[] args) {
        ClassRoom classroom1 = new ClassRoom(301, "2nd Floor");
        System.out.println("Building ID: " + classroom1.getId() + "\n" + "Building Name: " + classroom1.getLocation() + "\n");
    }
////hevig geteer method

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

}
