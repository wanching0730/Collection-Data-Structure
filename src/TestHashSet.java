import java.util.*;

public class TestHashSet {
    public static void main(String[] args) {
        // Create a hash set
        Set<String> set = new HashSet<String>();

        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        // Display using for loop
        for (String s: set) {
            System.out.print(s.toUpperCase() + " ");
        }

        System.out.println();

        // Display using iterator
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next() + " ");
    }
}