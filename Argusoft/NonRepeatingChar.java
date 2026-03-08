import java.util.HashMap;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbbcdeef";
        System.out.println(nonrep(str));
    }

    static String nonrep(String str){
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> hm = new HashMap<>();

        // stroe krlo hm me
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        // check kro frequency 1 ke equal then appen to sb
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hm.get(ch)==1){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
