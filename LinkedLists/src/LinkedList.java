import java.util.Arrays;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head, tail;
    private int size;

    public void addLast(int value){
        Node node = new Node(value);
        if (head==null) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public void removeFirst(){
        Node temp = head.next;
        head = temp;
        size--;
    }

    public void removeLast(){
        Node current = head;
        while(current != null){
            if (current.next.next == null){
                tail = current;
                current.next = null;
            }
            current = current.next;
        }
        size--;
    }

    public int indexOf(int value){
        Node current = head;
        int i=0;
        while(current != null){
            if (current.value == value) return i;
            current = current.next;
            i++;
        }
        return -1;
    }
    public boolean contains(int value){
        if (indexOf(value) == -1) return false;
        else return true;
    }

    public void reverse(){
        Node prev = head, current = head.next;
        while(current != null){
            Node next_ = current.next;
            current.next = prev;
            prev = current;
            current = next_;
        }
        tail = head;
        tail.next = null;
        head = prev;
    }

    public int getKthFromTheEnd(int k){
        Node counter1 = head;
        Node counter2 = counter1;
        for (int i=0;i<k-1;i++) {
            counter2 = counter2.next;
        }
        // System.out.println(counter1.value + " " + counter2.value + "\n");
        while(counter2 != tail){
            counter1 = counter1.next;
            counter2 = counter2.next;
        }

        return counter1.value;
    }
    
    public int size(){
        return this.size;
    }

    public int[] returnArray(){
        int[] arr = new int[size];
        Node current = head;
        int i=0;
        while(current != null){
            // System.out.println(current.value);
            arr[i++] = current.value;
            current = current.next;
        }
        // System.out.println(arr.toString());
        return arr;
    }

    public void print(){
        int[] arr = returnArray();
        System.out.println(Arrays.toString(arr));
    }
}
