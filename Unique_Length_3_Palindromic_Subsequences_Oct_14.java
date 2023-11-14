package leetcode.binarySearch.daily_challenge;

import java.util.HashSet;
import java.util.Set;

public class Unique_Length_3_Palindromic_Subsequences_Oct_14 {
    public static void main(String[] args) {
        String s = "aabca";
        int ans = countPalindromicSubsequence(s);
    }

    public static int countPalindromicSubsequence(String s) {
        int res = 0;
        Set<Character> uniq = new HashSet<>();

        for (char c : s.toCharArray()) {
            uniq.add(c);
        }

        for (char c : uniq) {
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);

            if (start < end) {
                Set<Character> charSet = new HashSet<>();
                for (int i = start + 1; i < end; i++) {
                    charSet.add(s.charAt(i));
                }
                res += charSet.size();
            }
        }

        return res;
    }
}
