public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        fibo(n);
    }

    static void fibo(int n){
        int a = 0;
        int b = 1;

        for(int i = 0;i<n;i++){
            System.out.println(a + " ");

            int next = a+b;
            a=b;
            b=next;
        }
    }
}
