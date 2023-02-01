import java.util.*;

public class PriorityQueue {
    private int queueArr[];
    private int count;

    PriorityQueue(int length){
        queueArr = new int[length];
    }

    public void insert(int value){
        int i;
        for (i=count-1;i>=0;i--){
            if (queueArr[i] > value)
                queueArr[i+1] = queueArr[i];
            else
                break;
        }
        queueArr[i+1] = value;
        count++;
    }

    public boolean isFull() {
        return count == queueArr.length;
      }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
    return Arrays.toString(queueArr);
    }
}
