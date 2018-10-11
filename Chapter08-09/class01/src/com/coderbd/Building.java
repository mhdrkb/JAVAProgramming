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
public class Building {

    int id;
    String name;
    String location;

    public static void main(String[] args) {
        Building building01 = new Building();
        building01.setId(201);
        building01.setName("Vuiya Villa");
        building01.setLocation("Mohammadpur");
        System.out.println("Building ID: " + building01.getId() + "\n" + "Building Name: " + building01.getName() + "\n" + "Building location : " + building01.getLocation() + "\n");
        Building building02 = new Building();
        building02.setId(202);
        building02.setName("Tareq Villa");
        building02.setLocation("Zigatola");
        System.out.println("Building ID: " + building02.getId() + "\n" + "Building Name: " + building02.getName() + "\n" + "Building location : " + building02.getLocation() + "\n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
