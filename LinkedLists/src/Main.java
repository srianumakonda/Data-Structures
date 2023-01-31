public class Main {
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addFirst(0);
        System.out.println(myLinkedList.indexOf(30));
        System.out.println(myLinkedList.contains(100));
        myLinkedList.removeFirst();

        int listToArray[] = myLinkedList.returnArray();
        System.out.println(listToArray.toString());
    }
}
