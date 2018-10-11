package com.mhd;
public class TestEdible {
    public static void main(String[] args) {
        Object[] obj = {new Tiger(), new Chicken(), new Apple(), new Orange(), new Mango()};
        for(int i = 0 ; i < obj.length; i++){
            if(obj[i] instanceof Animal){
                System.out.println(((Animal)obj[i]).sound());
                System.out.println(((Animal)obj[i]).color());
            }
            if(obj[i] instanceof Edible){
                System.out.println(((Edible)obj[i]).howTaste());
                System.out.println(((Edible)obj[i]).howToEat());
                
                
            }
        }
    }
}
