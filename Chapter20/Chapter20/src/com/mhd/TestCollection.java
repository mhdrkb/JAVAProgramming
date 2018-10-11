package com.mhd;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dalas");
        collection1.add("Madison");
        System.out.println("A list of cities in collection1: ");
        System.out.println(collection1);
        
        System.out.println("\nIs Dalas in collection1? "+ collection1.contains("Dalas"));
        collection1.remove("Dalas");
        System.out.println("\n"+collection1.size()+" Cities are in collection1 now");
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("\nA list of cities in collection2: ");
        System.out.println(collection2);
        
        
        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nA list of cities in collection1 or collection2: ");
        System.out.println(c1);
        c1=(ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nA list of cities in collection1 and collection2: ");
        System.out.println(c1);
        c1 = (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("\nA list of cities in collection1 but not in collection2: ");
        System.out.println(c1);
        
    }
}
