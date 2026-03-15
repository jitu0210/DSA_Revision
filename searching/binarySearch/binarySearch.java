package binarySearch;

public class binarySearch {
    public static void main(String[] args) {
       int[] arr = {-18,-3,2,5,7,8,9,10,120,210};
       int target = 5;
       System.out.println(bs(arr, target));
    }

    static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) { 
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
