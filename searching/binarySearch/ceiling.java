package binarySearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,12,14,70};
        int target = 8;
    }

    // Ceiling = smallest no. greater that or equal to target.
    static int ceilingNum(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (arr[start] < arr[end]) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if () {
                
            }
        }
    return -1;
    }
}
