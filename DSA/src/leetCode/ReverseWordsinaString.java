package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));

    }

    public static String reverseWords(String s) {

        String[] str = s.trim().split(" ");


        StringBuilder result=new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
             if (str[i] != "" ) {
                 result.append(str[i]) ;
                if(i!=0){

                    result.append(" ") ;
                }


            }

        }

        return result.toString();
    }

    static String splitString(String s) {

        List<Character> list = new ArrayList<>();
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((i == 0 || i == s.length() - 1) && s.charAt(i) == ' ') {
                list.add(' ');
            } else if ((s.charAt(i) == ' ' && list.get(list.size() - 1) == ' ')) {

            } else {
                list.add(s.charAt(i));
            }
        }
        return null;
    }
}
