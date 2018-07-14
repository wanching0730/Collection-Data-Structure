package MyLinkedList;

import java.util.List;

public class TestMyLinkedList {

    public static void main (String[] args) {
        String[] name = {"tom", "george", "peter", "jean", "jane"};
        MyLinkedList<String> list = new MyLinkedList<String>(name);

        System.out.println("Test contains()");
        System.out.println(list.contains("george"));
        System.out.println(list.contains("michelle"));

    }
}
