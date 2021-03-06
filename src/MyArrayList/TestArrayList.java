package MyArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        String[] name = {"tom", "george", "peter", "jean", "jane"};
        MyList<String> list1 = new MyArrayList<String>(name);

        String[] name2 = {"tom", "george", "michael", "michelle", "daniel"};
        MyList<String> list2 = new MyArrayList<String>(name2);

        System.out.println("List 1:");
        for(String s: list1)
            System.out.println(s.toUpperCase() + " ");

        System.out.println();

        System.out.println("List 2:");
        for(String s: list2)
            System.out.println(s.toUpperCase() + " ");

        System.out.println();

        list1.addAll(list2);
        System.out.println("Add all method:");
        for(String s: list1)
            System.out.println(s.toUpperCase() + " ");

        System.out.println();

        list1 = new MyArrayList<String>(name); // rebuild list1
        list1.retainAll(list2);
        System.out.println("Retain all method:");
        for(String s: list1)
            System.out.println(s.toUpperCase() + " ");

        list1.removeAll(list2);
        System.out.println("Remove all method:");
        for(String s: list1)
            System.out.println(s.toUpperCase() + " ");
    }
}
