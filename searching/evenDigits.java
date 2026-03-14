public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {4,2,3,7,9,8,10,12};
        System.out.println(findNumbers(nums));
        System.out.println(findEvenDigitArray(nums));
    }

    // finding even number of digits

    static int findNumbers(int[] nums){
        int count = 0;
        if(nums.length == 0){
            return -1;
        }

        for(int i = 0; i< nums.length; i++){
            if(nums[i]%2 == 0){
                count++;
            }
        }

        return count;
    }

    static int findEvenDigitArray(int[] nums){
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                System.out.print(nums[i]);
            }
            System.out.print(" ");
        }
        return -1;
    }
}
