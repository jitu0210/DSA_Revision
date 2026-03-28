package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 15, 11 };
        int target = 18;
        // System.out.println(Arrays.toString(twosum(arr, target)));
        System.out.println(Arrays.toString(twosum1(arr, target)));
    }

    // Brute force approach
    static int[] twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // optimized
    static int[] twosum1(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (hm.containsKey(complement)) {
                return new int[]{hm.get(complement),i};
            }

            hm.put(arr[i], i);
        }

        return new int[]{-1,-1};
    }
}
