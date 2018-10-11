package com.mhd;
public class Mango implements Edible{ //direct implements the Edible interface

    @Override
    public String howToEat() {
       return "Mango : Make mango juice or slice";
    }

    @Override
    public String howTaste() {
        return "Mango : Taste Sour or Sweet";
    }
    
}
