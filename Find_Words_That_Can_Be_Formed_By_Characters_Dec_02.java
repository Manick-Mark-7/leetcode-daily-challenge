package leetcode.binarySearch.daily_challenge;

public class Find_Words_That_Can_Be_Formed_By_Characters_Dec_02 {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int ans = countCharacters(words,chars);
        System.out.println(ans);
    }

    private static int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for(int i=0;i<chars.length();i++){
            counts[chars.charAt(i)-'a']++;
        }
        int ans = 0;
        for(String s : words){
            if(canForm(s,counts)){
                ans+=s.length();
            }

        }
        return ans;
    }
    private static boolean canForm(String word,int[] counts){
        int[] c = new int[26];
        for(int i=0;i<word.length();i++){
            int x = word.charAt(i)-'a';
            c[x]++;
            if(c[x]>counts[x])
                return false;
        }
        return true;
    }
}
