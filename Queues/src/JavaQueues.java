import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class JavaQueues {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        // queue.remove();
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) stack.add(queue.remove());
        while (!stack.isEmpty()) queue.add(stack.pop());
    }
}
