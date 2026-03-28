package patterns.SlidingWindow;

public class subArrayMaxSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 4, 2};
        int k = 3; // window size
        System.out.println(max(arr, k));
    }

    static int max(int[] arr,int k){
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }

        int maxsum = windowSum; // maxsum = first window size i.e. 2+1+5 = 8

        for (int j = k; j < arr.length; j++) {
            windowSum = windowSum + arr[j] - arr[j-k]; // arr[j-k] = arr[0] first index element removed
            maxsum = Math.max(maxsum, windowSum);
        }

        return maxsum;
    }
}
