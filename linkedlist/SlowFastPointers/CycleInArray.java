package linkedlist.SlowFastPointers;

public class CycleInArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 2 };
        System.out.println(detectCycle(arr));
    }

    static int detectCycle(int[] arr) {
        int slow = 0;
        int fast = 0;

        while (true) {
            slow = arr[slow];
            fast = arr[arr[fast]];

            if (slow == fast) {
                break;
            }
        }

        slow = 0;
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;

    }
}
