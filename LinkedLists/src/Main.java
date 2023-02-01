import java.lang.foreign.MemoryLayout;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addLast(40);
        myLinkedList.addLast(50);

        myLinkedList.addFirst(0);
        myLinkedList.removeFirst();

        // System.out.println(myLinkedList.indexOf(30));
        // System.out.println(myLinkedList.contains(100));

        // myLinkedList.reverse();
        // myLinkedList.print();

        System.out.println(myLinkedList.getKthFromTheEnd(10));
    }
}
