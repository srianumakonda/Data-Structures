public class Main {
    public static void main(String[] args){
        // ArrayQueue queue = new ArrayQueue(5);
        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // int garbage = queue.dequeue();
        // queue.dequeue();
        // queue.enqueue(40);
        // queue.enqueue(50);
        // queue.enqueue(60);
        // queue.enqueue(70);
        // System.out.println(queue);

        // QueueFromStacks queue = new QueueFromStacks();
        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // queue.dequeue();

        PriorityQueue queue = new PriorityQueue(5);
        queue.insert(10);
        queue.insert(30);
        queue.insert(20);
        System.out.println(queue);
    }
}
