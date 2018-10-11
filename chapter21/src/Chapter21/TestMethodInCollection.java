
package Chapter21;

import java.util.HashSet;

public class TestMethodInCollection {
    public static void main(String[] args) {
        java.util.Set<String> set01 = new java.util.HashSet<>(); // i can use import java.util.Set instead of this
        set01.add("London");
        set01.add("Paris");
        set01.add("New York");
        set01.add("San Fransisco");
        set01.add("Beijing");
        System.out.println("set01 is : " +  set01);
        System.out.println(set01.size() + " elements in set01");
        set01.remove("New York");
        System.out.println("\nset01 is : " +  set01);
        System.out.println(set01.size() + " elements in set01");
        java.util.Set<String> set02 = new HashSet<>();
        set02.add("London");
        set02.add("Shanghai");
        set02.add("paris");
        set02.add("Paris");
        System.out.println("\nset02 is : " + set02);
        System.out.println(set02.size() + " elements in set02");
        System.out.println("\nIs Tapei in set02 ? " + set02.contains("Tapei"));
        System.out.println("\nIs London in set02 ? " + set02.contains("London"));
        //set01.addAll(set02);
        //System.out.println("\nAfter adding set01 and set02 , set01 is " + set01);
        //set01.removeAll(set02);
        //System.out.println("\nAfter removing set02 from set01, set01 is " + set01);
        set01.retainAll(set02);
        System.out.println("\nAfter removing common elements in set02 from set01, set01 is " + set01);
        
    }
}
