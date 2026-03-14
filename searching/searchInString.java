import java.util.Arrays;

public class searchInString {
    public static void main(String[] args) {
        String str = "jitu";
        char ch = 't';
        System.out.println(search(str, ch));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static int search(String str, char ch){
        if(str.length() == 0){
            return -1;
        }

        for(int i = 0; i< str.length(); i++){
            if(ch == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
