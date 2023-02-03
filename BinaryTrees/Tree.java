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

}
