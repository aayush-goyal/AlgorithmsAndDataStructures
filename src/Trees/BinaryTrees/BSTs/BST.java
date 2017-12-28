package Trees.BinaryTrees.BSTs;

import Trees.BinaryTrees.BinaryTree;
import Trees.BinaryTrees.Node;

public class BST extends BinaryTree{
    public BST() {
        super();
    }

    public BST(int key) {
        super(key);
    }

    public Node search(int number) {
        return search(this.root, number);
    }

    private Node search(Node root, int key) {
        if(root == null) {
            System.out.println("No match found in the tree for the given key.");
            return root;
        }
        else if(root.key == key)
            return root;
        else if(key > root.key)
            return search(root.right, key);
        else
            return search(root.left, key);
    }

    public Node insert(int key) {
        return insert(this.root, key);
    }

    private Node insert(Node root, int key) {
        if (root == null){
            root = new Node(key);
            return root;
        } else if(key > root.key)
            root.right = insert(root.right, key);
        else {
            root.left = insert(root.left, key);
        }

        return root;
    }
}