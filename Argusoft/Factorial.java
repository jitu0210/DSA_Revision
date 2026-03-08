public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = 1;
        System.out.println(fact(n, ans));
    }

    static int fact(int n,int ans){
        for(int i = n;i>=1;i--){
            ans = ans *i;
        }

        return ans;
    }
}
