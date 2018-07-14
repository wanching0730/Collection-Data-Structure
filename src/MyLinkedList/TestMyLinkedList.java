package MyLinkedList;

import java.util.List;

public class TestMyLinkedList {

    public static void main (String[] args) {
        String[] name = {"tom", "george", "peter", "jean", "jane"};
        MyLinkedList<String> list = new MyLinkedList<String>(name);

        System.out.println("Test contains()");
        System.out.println(list.contains("tom"));
        System.out.println(list.contains("michelle"));

        System.out.println("Test get()");
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        System.out.println("Test indexOf()");
        System.out.println(list.indexOf("jean"));
        System.out.println(list.indexOf("tom"));
        System.out.println(list.indexOf("Peter"));

    }
}
