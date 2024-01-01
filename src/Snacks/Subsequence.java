package Snacks;

public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
//       int MaxLength = Math.max(s.length(), t.length());

        int sIndx = 0;
        for (int i = 0; i < t.length() && sIndx < s.length() ;i++) {


            if (t.charAt(i) == s.charAt(sIndx)  ){
                sIndx++;


            }
        }



          return sIndx == s.length();
    }

    public static void main(String[] args) {
        String let1 = "abc";
        String let2 = "ahbgdc";
        System.out.println(isSubsequence(let1, let2));
    }
}
