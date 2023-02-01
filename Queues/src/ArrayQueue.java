import java.util.Arrays;

public class ArrayQueue {
    private int[] queueArr;
    private int count, start=0, end;

    ArrayQueue(int length){
        queueArr = new int[length];
    }
    public void enqueue(int value){
        if (count == queueArr.length) throw new IllegalStateException();
        end = (end+1)%queueArr.length;
        queueArr[end] = value;
        count++;
    }
    public int dequeue(){
        int value = queueArr[start];
        start = (start+1)%queueArr.length;
        queueArr[start] = 0;
        count--;
        return value;
    }
    public int peek(){
        return queueArr[start];
    }

    public boolean isEmpty(){
        for (int i : queueArr) if (i==0) return true;
        return false;
    }

    public boolean isFull(){
        return !isEmpty();
    }

    @Override
    public String toString(){
        return Arrays.toString(queueArr);
    }
}
