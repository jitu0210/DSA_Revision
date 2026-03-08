import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};
        int k = 4;
        System.out.println(largest(arr,k));
    }

    static int largest(int[] arr,int k){
        Arrays.sort(arr);
        
        if (k > 0 && k <= arr.length) {
            return arr[arr.length - k];
        } else {
            return -1;
        }
    }
}
