public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }

    static String reverse(String str){
        String rev = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
}
