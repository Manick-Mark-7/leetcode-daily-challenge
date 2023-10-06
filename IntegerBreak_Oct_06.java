package leetcode.binarySearch.daily_challenge;

import java.util.Random;

public class IntegerBreak_Oct_06 {
    public static void main(String[] args) {
        int  n = new Random().nextInt(58);
        int ans = integerBreak(n);

    }

    private static int integerBreak(int n) {
        if(n==2) return 2;
        if(n==3) return 3;
        int count_of_3s = n/3;
        int rem = n%3;
        if(rem == 0)
            return (int)Math.pow(3,count_of_3s);
        else if(rem==1) return (int)Math.pow(3,count_of_3s-1)*4;
        else return(int)Math.pow(3,count_of_3s)*2;
    }
}
