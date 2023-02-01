import java.util.*;

public class ReverseAString {
    public static void main(String[] args){
        String myString = "abcdef";
        char[] out = reverseString(myString);
        System.out.println(Arrays.toString(out));
    }

    public static char[] reverseString(String inString){
        int i=0;
        char[] reversed = new char[inString.length()];
        Stack<Character> stack = new Stack<>();
        for (char letter : inString.toCharArray()){
            stack.push(letter);
        }
        while (!stack.isEmpty()){
            reversed[i] = stack.pop();
            i++;
        }
        return reversed;

    }
}
