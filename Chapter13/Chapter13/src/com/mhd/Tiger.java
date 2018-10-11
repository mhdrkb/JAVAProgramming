
package com.mhd;

public class Tiger extends Animal { //indoor extending and outdoor implementing via Animal class as animal class implements the Edible interface

    @Override
    public String sound() {
        return "Tger: ROARR"; 
    }

    @Override
    public String color() {
        return "Tger : Color Yellow Black mix";
    }

    @Override
    public String howToEat() {
        return "Tiger : No way to Eat. It is ferocious";
    }

    @Override
    public String howTaste() {
        return "Tiger : Have no taste";
    }
    
}
