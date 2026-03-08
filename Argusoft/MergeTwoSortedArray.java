
import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6};
        int[] mergedarray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedarray));
    }

    static int[] merge(int[] arr1,int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                merged[k++] = arr1[i++];
            }
            else{
                merged[k++]=arr2[j++];
            }
        }

        while(i<m){
            merged[k++] = arr1[i++];
        }

        while(j<n){
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}
