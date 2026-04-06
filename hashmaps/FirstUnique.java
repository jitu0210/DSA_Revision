import java.util.HashMap;

public class FirstUnique {
    public static void main(String[] args) {
        String str = "aabbcdde";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating: " + ch);
                return;
            }
        }
    }
}