import java.util.HashMap;

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "abbbacc";
        occurrence(str);
    }

    static void occurrence(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (hm.containsKey(currentChar)) {
                hm.put(currentChar, hm.get(currentChar) + 1);
            } else {

                hm.put(currentChar, 1);
            }
        }

        System.out.println(hm);
    }
}
