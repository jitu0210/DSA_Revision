package patterns.SlidingWindow;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static int solve(String s) {
        int start = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(solve("abcabcbb")); 
    }

}


