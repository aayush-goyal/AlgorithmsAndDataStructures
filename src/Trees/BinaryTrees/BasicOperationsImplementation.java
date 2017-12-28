package Trees.BinaryTrees;

public class BasicOperationsImplementation {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

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