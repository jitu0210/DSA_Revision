public class linear {
    public static void main(String[] args) {
        int[] arr = {4,6,2,1,9};
        int target = 1;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
