package Chapter21;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {
        Set<String> set01 = new HashSet<>();
        set01.add("London");
        set01.add("Paris");
        set01.add("New York");
        set01.add("San Fransisco");
        set01.add("Beijing");
        set01.add("New York");

        TreeSet<String> treeSet = new TreeSet<>(set01);
        System.out.println("Shorted Tree set : " + treeSet);
        
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));
        
        
        System.out.println("\nlower(\"P\"): " + treeSet.lower("New York"));
        System.out.println("higher(\"P\"): " + treeSet.higher("New York"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("New York"));
        System.out.println("floor(\"P\"): " + treeSet.floor("New York"));
        
        System.out.println("\npollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        

    }

}
