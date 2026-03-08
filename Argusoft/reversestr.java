public class reversestr {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(rev(str));
    }

    static String rev(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}
