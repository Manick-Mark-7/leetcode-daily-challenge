package leetcode.binarySearch.daily_challenge;


//Find whether given two strings are anagrams or not
public class Valid_Anagram_Dec_16 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }

    private static  boolean isAnagram(String s , String t){
        if(s.length()!=t.length()) return false;

        int[] frq = new int[26];
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)-'a']++;
            frq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<frq.length;i++){
            if(frq[i]!=0)
                return false;
        }
        return true;
    }
}
