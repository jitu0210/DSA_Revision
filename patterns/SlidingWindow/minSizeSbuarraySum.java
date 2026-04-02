package patterns.SlidingWindow;

// min. lenght of subarray whose sum >= target.
// DYNAMIC SLIDING WINDOW

public class minSizeSbuarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4 };
        int target = 4;
        System.out.println(minSubarray(arr, target));
    }

    static int minSubarray(int[] arr, int target) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        while (high < arr.length) {
            sum = sum + arr[high];
            while (sum >= target) {
                int length = high - low + 1;
                result = Math.min(result, length);
                sum = sum - arr[low];
                low++;
            }
            high++;
        }
        return (result == Integer.MAX_VALUE) ? 0 : result;
    }
}
