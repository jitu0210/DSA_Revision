import java.util.HashSet;

public class RemoveDupliStrnigChaar {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(rem(str));
    }

    static String rem(String str){
        HashSet <Character> hs = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (!hs.contains(ch)) {
                sb.append(ch);
                hs.add(ch);
            }
        }

        return sb.toString();
    }
    
}
