public class findMin {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 4, 5, 1, 57, 9 };
        System.out.println(search(arr));
    }

    static int search(int[] arr) {

        int min = arr[0];

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
