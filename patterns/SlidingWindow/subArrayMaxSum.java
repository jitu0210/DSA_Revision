package patterns.SlidingWindow;

public class subArrayMaxSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3; // window size
        System.out.println(max(arr, k));
    }

    static int max(int[] arr,int k){
        int maxsum = Integer.MIN_VALUE;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }

        for (int j = k; j < arr.length; j++) {
            windowSum += arr[j] - arr[j-k];
            maxsum = Math.max(maxsum, windowSum);
        }

        return maxsum;
    }
}
