public class Primenumbers {
    public static void main(String[] args) {
        int n=12;
        System.out.println(isprime(n));
    }

    static boolean isprime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}


//why math.sqrt(n)

// Let’s take n = 36.

// Factors of 36:


// 2 × 18  
// 3 × 12  
// 4 × 9  
// 6 × 6  
// 9 × 4  
// 12 × 3  
// 18 × 2
// Notice:

// Once you reach 6 × 6 (√36 = 6), the pairs start repeating in reverse.

// So if you haven’t found a factor by √n, you won’t find one after it either.