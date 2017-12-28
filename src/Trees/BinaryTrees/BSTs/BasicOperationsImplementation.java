package Trees.BinaryTrees.BSTs;

import Trees.BinaryTrees.Node;

public class BasicOperationsImplementation {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(50); tree.insert(40); tree.insert(60); tree.insert(30);
        Node fourth = tree.insert(45);
        Node fifth = tree.insert(55);
        Node sixth = tree.insert(20);
        Node seventh = tree.insert(57);

        if(tree.search(20) != null)
            System.out.println(tree.search(20).key);
        if(tree.search(100) != null)
            System.out.println(tree.search(100).key);

        tree.preorderTraversalRecursive();
        System.out.println();
        tree.preorderTraversalUsingStack();
        System.out.println();
        tree.inorderTraversalRecursive();
        System.out.println();
        tree.inorderTraversalUsingStack();
        System.out.println();
        tree.postorderTraversalRecursive();
        System.out.println();
        tree.postorderTraversalUsingStack();
        System.out.println();

        System.out.println("Dealing with tree 2.");

        BST tree2 = new BST(38);
        tree.insert(14);
        tree.insert(8);
        tree.insert(23);
        tree.insert(18);
        tree.insert(20);
        tree.insert(56);
        tree.insert(45);
        tree.insert(82);
        tree.insert(70);

        tree.preorderTraversalRecursive();
        System.out.println();
        tree.preorderTraversalUsingStack();
        System.out.println();
        tree.inorderTraversalRecursive();
        System.out.println();
        tree.inorderTraversalUsingStack();
        System.out.println();
        tree.postorderTraversalRecursive();
        System.out.println();
        tree.postorderTraversalUsingStack();
        System.out.println();
    }
}