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
    
    public int size(){
        return this.size;
    }

    public int[] returnArray(){
        int[] arr = new int[size];
        Node current = head;
        int i=0;
        while(current != null){
            arr[i++] = current.value;
            current = current.next;
        }
        return arr;
    }

    public void print(int value){
        int[] arr = returnArray();
        System.out.println(arr.toString());
    }
}
