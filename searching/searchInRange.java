public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {6,5,7,9,1,3};
        int target = 7;
        System.out.println(range(arr, target));
    }

    static int range(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        
        // range is 1 to 4
        for(int i = 1; i<4 ; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
