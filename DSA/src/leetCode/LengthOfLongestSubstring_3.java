package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring_3 {
    public static void main(String[] args) {

        System.out.println("Hello world!"+lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int fP=0;
        int sP=0;
        Set<Character> set=new HashSet<>();
        int max=0;
        while(sP<s.length()){
            if(set.contains(s.charAt(sP))){
                set.remove(s.charAt(fP));
                fP++;
            }else{
                set.add(s.charAt(sP));
                max=Math.max(set.size(),max);
                sP++;
            }
        }
        return max;

    }
}
