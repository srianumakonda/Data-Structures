package BinaryTrees;

public class Main {
    public static void main(String[] args){
        Tree b = new Tree(5);
        b.insert(6);
        b.insert(4);
        System.out.println(b.find(10));
    }
}
