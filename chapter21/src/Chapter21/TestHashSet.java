
package Chapter21;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set01 = new HashSet<>();
        
        set01.add("London");
        set01.add("Paris");
        set01.add("New York");
        set01.add("San Fransisco");
        set01.add("Beijing");
        set01.add("New York");
        System.out.println(set01);
        for(String s: set01){
            System.out.print(s.toUpperCase() + " ");
        }
    }
}
