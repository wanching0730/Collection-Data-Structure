import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Testing {

    public static void main (String[] args) {

        List<String> set = new LinkedList<>();
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("donkey");
        set.add("zebra");
        set.add("mouse");
        set.add("donkey");
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("donkey");
        set.add("zebra");
        set.add("mouse");
        set.add("donkey");
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("donkey");
        set.add("zebra");
        set.add("mouse");
        set.add("donkey");

        Iterator iterator = set.iterator();
        long start = System.currentTimeMillis();
        System.out.println("Iterator Start time: " + start);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("end time: " + (System.currentTimeMillis() - start));

        long start1 = System.currentTimeMillis();
        System.out.println("For loop Start time: " + start1);
        for(int i = 0; i < set.size(); i++) {
            System.out.println(set.get(i));
        }
        System.out.println("end time: " + (System.currentTimeMillis() - start1));

    }
}
