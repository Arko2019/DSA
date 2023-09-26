import java.util.ArrayList;
import java.util.List;

public class Removingstarsfromastring_2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                list.remove(list.size() - 1);
            } else {
                list.add(s.charAt(i));
            }
        }
        String result = "";
        for (Character c : list) {
            result += c;
        }
        return result;

    }
}
