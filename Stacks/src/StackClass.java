public class StackClass {
    private int[] stackArr;
    private int idx;

    public StackClass(int length){
        stackArr = new int[length];
    }
    public void push(int value){
        stackArr[idx++] = value;
        if (idx==stackArr.length) throw new StackOverflowError();
    }
    public void pop(){
        stackArr[idx] = 0;
        idx--;
    }
    public int peek(){
        return stackArr[idx];
    }
    public boolean isEmpty(){
        return idx==0;
    }
}
