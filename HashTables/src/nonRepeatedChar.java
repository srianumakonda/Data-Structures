import java.util.*;

public class nonRepeatedChar {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sri");
        map.put(2, "Sri");
        map.put(3, "Sri");
        System.out.println(map);

        System.out.println(detect("a green apple"));

    }

    public static char detect(String input){
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()){
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c)+1);
        }

        for (char c : input.toCharArray()){
            if (map.get(c)==1) return c;
        }

        return Character.MIN_VALUE;
    }
}
