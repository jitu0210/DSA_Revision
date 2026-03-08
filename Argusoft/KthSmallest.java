import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        System.out.println(smallest(arr, k));

    }

    static int smallest(int[] arr,int k){
        Arrays.sort(arr);
        if (k > 0 && k <= arr.length) {
            return arr[k-1];
        } else {
            return -1;
        }
    }
}
