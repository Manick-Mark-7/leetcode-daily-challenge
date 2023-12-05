package leetcode.binarySearch.daily_challenge;

import java.util.Random;

public class Count_Of_Matches_In_Tournament_Dec_05 {
    public static void main(String[] args) {
        int n = new Random().nextInt(10);
        int ans = numberOfMatches(n);
        System.out.println(ans);
    }

    private static int numberOfMatches(int n) {
        int ans = 0;
        int temp = n;
        int match = 0;
        while(temp>1){
            match = temp/2;
            ans+=match;
            temp-=match;
        }
        return ans;
    }
}
