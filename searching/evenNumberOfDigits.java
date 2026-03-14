public class evenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {18,124,19,1764,98,1};
        System.out.println(even(arr));
    }


    // Steps:
    // 1. count the no. of digits
    // 2. convert it into string and take the length

    static int even(int[] arr){

        int count = 0;
        for(int i = 0; i< arr.length; i++){
            while (arr[i]>0) {
                count++;
                arr[i] = arr[i]/10;
            }
        }
        return count;
    }
}
