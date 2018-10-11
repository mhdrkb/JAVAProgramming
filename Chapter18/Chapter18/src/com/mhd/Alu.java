package com.mhd;

public class Alu {

    private final int weight;
    private final String name;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Alu(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alu{" + "weight=" + weight + ", name=" + name + '}';
    }
    
}
