
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,6,4};
        dupli(arr);
    }

    static void dupli(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        System.out.println(hs);
    }
}
