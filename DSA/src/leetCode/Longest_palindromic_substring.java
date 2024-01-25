package leetCode;

public class Longest_palindromic_substring {

    public static void main(String[] args) {
        String s = "babba";
        Boolean memo[][] = new Boolean[s.length()][s.length()];
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        boolean memo[][] = new boolean[s.length()][s.length()];
        String result = "";
        int n = s.length();
        int i = 0;
        int j = 0;
        for (int diff = 0; diff < n; diff++) {
            for (i = 0, j = diff + i; j < n; i++, j++) {
                if (i == j) {
                    memo[i][j] = true;
                } else if (diff == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        memo[i][j] = true;
                    } else {
                        memo[i][j] = false;
                    }
                } else  {
                    if (s.charAt(i) == s.charAt(j) && memo[i + 1][j - 1])
                    memo[i][j] = true;

                }

                if (memo[i][j] == true ) {
                    String str = s.substring(i, j + 1);
                    if(str.length() > result.length())
                    result = str;

                }
            }

        }

        return result;
    }


    public static boolean isPalindromRecursion(String s, int i, int j, Boolean[][] memo) {
        if (memo[i][j] != null) {
            return memo[i][j];
        } else {
            if (i >= j) {
                memo[i][j] = true;
                return true;
            }
            if (s.charAt(i) == s.charAt(j)) {
                memo[i][j] = isPalindromRecursion(s, i + 1, j - 1, memo);
                return memo[i][j];
            } else {
                memo[i][j] = false;
                return false;
            }
        }


    }
}
