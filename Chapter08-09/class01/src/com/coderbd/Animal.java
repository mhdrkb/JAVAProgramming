package com.coderbd;

public class Animal {

    String name;
    String color;
    double age;
    String race;

    public Animal() {
    }

    public Animal(String name, String color, double age, String race) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }

    void bite() {
    }

    void run() {
    }

    void walk() {
    }

    void eat() {
    }

    void bark() {
    }

    public static void main(String[] args) {
        Animal tommy = new Animal();
        Animal fazil = new Animal("Mr.Monty", "Black", 20.5, "American");
        System.out.println(fazil);
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }

}
