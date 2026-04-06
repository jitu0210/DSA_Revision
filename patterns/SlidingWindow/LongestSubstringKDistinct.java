package patterns.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(longestSubstring(s, k));
    }
    public static int longestSubstring(String s, int k) {
        int start = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char rightChar = s.charAt(end);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            // Shrink window if distinct chars > k
            while (map.size() > k) {
                char leftChar = s.charAt(start);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

}
