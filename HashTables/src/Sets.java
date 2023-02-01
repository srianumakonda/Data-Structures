import java.util.*;

public class Sets {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        int[] nums = {1,2,3,4,3,2,4,2};
        for (int n : nums) set.add(n);
        System.out.println(set);


        System.out.println(firstRepeatedChar("green apple"));
    }

    public static char firstRepeatedChar(String input){
        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()){
            if (set.contains(c)) return c;
            else set.add(c);
        }

        return Character.MIN_VALUE;
    }
}
