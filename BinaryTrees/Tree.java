package BinaryTrees;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild, rightChild;
        Node (int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node = " + this.value;
        }
    }

    private Node root;

    Tree(int value){
        root = new Node(value);
    }

    void insert(int value){
        var current = root;
        while (true){
            if (value > current.value){
                if(current.rightChild==null){
                    current.rightChild = new Node(value); 
                    break;
                }
                current = current.rightChild;
            }
            else {
                if(current.leftChild==null){
                    current.leftChild = new Node(value); 
                    break;
                }
                current = current.leftChild;
            }
        }
    }

    boolean find(int value){
        var current = root;
        while (current != null){
            if (value > current.value){
                if(current.value==value) return true;
                current = current.rightChild;
            }
            else {
                if(current.value==value) return true;
                current = current.leftChild;
            }
        }
        return false;
    }

    // Overloading
    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node node){
        // root -> left -> right
        if (node==null) return; //base condition
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    
    // Overloading
    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node){
        // left -> root -> right
        if (node==null) return; //base condition
        preOrderTraversal(root.leftChild);
        System.out.println(root.value);
        preOrderTraversal(root.rightChild);
    }

    // Overloading
    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node node){
        // left -> root -> right
        if (node==null) return; //base condition
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if (node == null) return -1;
        if (node.leftChild == null && node.rightChild == null) return 0;
        return 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

}
