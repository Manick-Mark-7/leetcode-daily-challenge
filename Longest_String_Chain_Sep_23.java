package leetcode.binarySearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_String_Chain_Sep_23 {
    //Find the longest String chain length by adding a letter with the predecessor word without changing the order
    public static void main(String[] args) {
        String[] words = {"a" , "b" ,"ba","bca","bda","bdca"};
        int ans = longestStrChain(words);
        System.out.println(ans);
    }

    private static int longestStrChain(String[] words) {
        Arrays.sort(words,(s1, s2) -> Integer.compare(s1.length(),s2.length()));
        Map<String,Integer> map = new HashMap<>();
        int ans = 0;
        for(String word : words){
            int longest = 0;
            for(int i=0;i<word.length();i++){
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                String subStr = sb.toString();
                longest = Math.max(longest,map.getOrDefault(subStr,0)+1);
            }
            map.put(word,longest);
            ans = Math.max(ans,longest);
        }
        return ans;
    }
}
