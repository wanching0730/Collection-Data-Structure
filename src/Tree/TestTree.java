package Tree;

import java.util.Iterator;

public class TestTree {
    public static void main (String[] args) {
        BinaryTree<Integer> bst = new BinaryTree<Integer>();

        for(int i = 0; i < 20; i++) {
            bst.insert((int)(Math.random() * 200) - 100);
        }

        Iterator<Integer> iterator = bst.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("Total leaves: " + bst.getNumberOfLeaves());

        // find sum using for loop
        int sum = 0;
        for(int e: bst) {
            sum += e;
        }
        System.out.println("The sum using for loop is: " + sum);

        // find sum using recursive method
        System.out.println("The sum using recursive method is: " + findSum(bst));
    }

    public static int findSum(BinaryTree bst) {
        return findSum(bst.root);
    }

    public static int findSum(BinaryTree.TreeNode root) {
        int sum = 0;
        if(root != null) {
            sum = Integer.parseInt(root.element.toString()) + findSum(root.left) + findSum(root.right);
        }

        return sum;
    }
}
