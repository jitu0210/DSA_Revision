public class PowerFunction {
    public static void main(String[] args) {
        int n = 2;
        int p = 3;
        System.out.println(pow(n, p));
    }

    static int pow(int n,int p){
        int ans =1;

        for(int i =1;i<=p;i++){
            ans = ans * n;
        }

        return ans;
    }
}
