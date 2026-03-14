import java.util.Arrays;

public class searchTWODarray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,3},{8,10,4},{6,1,2}};
        int target = 4;
        int[] ans = search(arr, target); // format for return value {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        if (arr.length == 0) {
            return new int[]{-1,-1};
        }

        for(int i = 0; i<arr.length; i++){ // row
            for(int j = 0; j<arr[i].length; j++){ // column
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
