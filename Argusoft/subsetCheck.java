import java.util.HashSet;

public class subsetCheck {

    public static boolean isSubset(int[] subsetArr, int[] mainArr) {
      
        HashSet<Integer> set = new HashSet<>();
        for (int num : mainArr) {
            set.add(num);
        }

        for (int num : subsetArr) {
            if (!set.contains(num)) {
                return false;  
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        int[] mainArr = {11, 1, 13, 21, 3, 7};
        int[] subsetArr = {11, 3, 7, 1};

        if (isSubset(subsetArr, mainArr)) {
            System.out.println("subsetArr is a subset of mainArr");
        } else {
            System.out.println("subsetArr is NOT a subset of mainArr");
        }
    }
}

