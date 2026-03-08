public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalin(num));
    }

    static boolean isPalin(int num) {
        int originalNum = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        return rev == originalNum;
    }
}
