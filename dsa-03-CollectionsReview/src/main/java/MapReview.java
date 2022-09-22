import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");

        System.out.println(studentsMap.get(1));

        String str = "JJavvaDDevelloopperr";

        System.out.println(findFirstNonRepeating(str));

    }

    public static Character findFirstNonRepeating(String str) {

        Map<Character, Integer> map = new HashMap<>();  // this costs space complexity

        int count;

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else map.put(ch, 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) return ch;
        }

        return null;
    }
}
