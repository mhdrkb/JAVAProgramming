package Chapter21;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set01 = new LinkedHashSet<>();
        
        set01.add("London");
        set01.add("Paris");
        set01.add("New York");
        set01.add("San Fransisco");
        set01.add("Beijing");
        set01.add("New York");
        System.out.println(set01);
        for(String element : set01){
            System.out.print(element.toLowerCase() + " ");
        }
    }
}
