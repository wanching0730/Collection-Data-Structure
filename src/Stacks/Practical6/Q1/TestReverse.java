package Stacks.Practical6.Q1;

import java.util.Scanner;

public class TestReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GenericStack<Character> stack = new GenericStack<>();
        GenericQueue<Character> queue = new GenericQueue<>();

        System.out.println("Enter a string: ");
        // if use next() will ignore "space" entered
        String str = scanner.nextLine();

        for(int i = 0; i < str.length(); i++) {
            queue.enqueue(str.charAt(i));
        }

        while(queue.getSize() > 0) {
            Character c = queue.dequeue();
            stack.push(c);
        }

        while(!stack.isEmpty())
            System.out.print(stack.pop());
    }



}
