public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 0, 6, 0, 4 };
        MoveZeros(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void MoveZeros(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}
