import java.util.Stack;

public class BalancedExpressions {
    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()){
            if (c == '(') stack.push(c);
            if (c == ')'){
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        String exp = "(((1+(2+2)))";
        System.out.println(isBalanced(exp));
    }
}
