import java.util.HashMap;

public class CountCharOccurence {
    public static void main(String[] args) {
        String str = "aaabbc";
        System.out.println(occur(str));
    }

    static HashMap<Character,Integer> occur(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        return map;
    }
}
