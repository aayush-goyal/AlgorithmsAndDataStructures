package Trees.BinaryTrees;

import java.util.Stack;

public class BinaryTree {
    public Node root;

    public BinaryTree(int key) {
        root = new Node(key);
    }

    public BinaryTree() {
        root = null;
    }

    public void preorderTraversalRecursive() {
        preorderTraversalRecursive(root);
    }

    private void preorderTraversalRecursive(Node root) {
        if(root == null)
            return;
        System.out.print(root.key + " ");
        preorderTraversalRecursive(root.left);
        preorderTraversalRecursive(root.right);
    }

    public void preorderTraversalUsingStack() {
        preorderTraversalUsingStack(root);
    }

    private void preorderTraversalUsingStack(Node root) {
        Stack<Node> stack = new Stack<>();
        Node ptr;
        stack.push(root);
        while (!stack.isEmpty()) {
            ptr = stack.pop();
            System.out.print(ptr.key + " ");
            if(ptr.right != null)
                stack.push(ptr.right);
            if(ptr.left != null)
                stack.push(ptr.left);
        }
    }

    public void inorderTraversalRecursive() {
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(Node root) {
        if(root == null)
            return;
        inorderTraversalRecursive(root.left);
        System.out.print(root.key + " ");
        inorderTraversalRecursive(root.right);
    }

    public void inorderTraversalUsingStack() {
        inorderTraversalUsingStack(root);
    }

    private void inorderTraversalUsingStack(Node root) {
        Stack<Node> stack = new Stack<>();
        Node ptr;
        stack.push(root);
        while(!stack.isEmpty()) {
            ptr = stack.pop();
            if(ptr.right == null) {
                System.out.print(ptr.key + " ");
                ptr = stack.pop();
            } else {
                System.out.print(ptr.key + " ");
            }
                stack.push(ptr.right);
            while (ptr.left != null) {
                stack.push(ptr.left);
                ptr = ptr.left;
            }
            System.out.print(ptr.key + " ");
        }
    }

    public void postorderTraversalRecursive() {
        postorderTraversalRecursive(root);
    }

    private void postorderTraversalRecursive(Node root) {
        if(root == null)
            return;
        postorderTraversalRecursive(root.left);
        postorderTraversalRecursive(root.right);
        System.out.print(root.key + " ");
    }

    public void postorderTraversalUsingStack() {
        postorderTraversalUsingStack(root);
    }

    private void postorderTraversalUsingStack(Node root) {
        Stack<Node> stack = new Stack<>();
        Node ptr;
        stack.push(root);
        while (!stack.isEmpty()) {
            ptr = stack.pop();
            if(ptr.right != null)
                stack.push(ptr.right);
        }
    }
}