import java.util.LinkedList;

public class TestLinkedListIterators {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // build the list
        for(int i = 0; i < 100000; i++)
            list.add(i);

        // traverse by using index
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < list.size(); i++)
            list.get(i);
        long endTime = System.currentTimeMillis();
        System.out.print("traverse time using index is " + (endTime - startTime));

        // traverse using iterator
        startTime = System.currentTimeMillis();
        int x;

        // for each loop is running iterator
        for(int i: list)
            x = i;

        endTime = System.currentTimeMillis();
        System.out.println("traverse time using iterator is " + (endTime-startTime));
    }
}
