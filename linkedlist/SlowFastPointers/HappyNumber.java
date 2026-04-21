package linkedlist.SlowFastPointers;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    static int sumOfSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum = sum + d * d;

        }

        return sum;
    }

    static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        while (true) {
            slow = sumOfSquare(slow);                  // move 1 step
            fast = sumOfSquare(sumOfSquare(fast));     // move 2 steps

            if (fast == 1) return true;

            if (slow == fast) return false;
        }
    }
}
