package MyLinkedList;

public class TestMyLinkedList {

    public static void main (String[] args) {
        String[] name = {"tom", "george", "peter", "jean", "jane", "george"};
        MyLinkedList<String> list = new MyLinkedList<String>(name);

        System.out.println("Test contains()");
        System.out.println(list.contains("tom"));
        System.out.println(list.contains("michelle"));

        System.out.println("Test get()");
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        System.out.println("Test indexOf()");
        System.out.println(list.indexOf("george"));
        System.out.println(list.indexOf("tom"));
        System.out.println(list.indexOf("jane"));
        System.out.println(list.indexOf("Peter"));

        System.out.println("Test lastIndexOf()");
        System.out.println(list.lastIndexOf("jane"));
        System.out.println(list.lastIndexOf("george"));

        System.out.println("Test set()");
        System.out.println(list.set(3, "janny"));
        System.out.println(list.set(0, "tommy"));
        System.out.println(list);
    }
}
