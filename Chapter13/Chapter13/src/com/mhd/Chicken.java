
package com.mhd;

public class Chicken extends Animal implements Edible { //indoor type extending and implementing 

    @Override
    public String sound() {
       return "Chicken : cock-a-double-doo";
    }

    @Override
    public String howToEat() {
       return "Chicken : Fry it";
    }

    @Override
    public String color() {
        return "Chicken : White";
    }

    @Override
    public String howTaste() {
        return "Chicken : Tastes Yammy..";
    }
    
}
