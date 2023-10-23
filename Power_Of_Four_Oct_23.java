package leetcode.binarySearch.daily_challenge;

import java.util.Random;

public class Power_Of_Four_Oct_23 {
    public static void main(String[] args) {
        int n = new Random().nextInt(20);
        System.out.println(isPowerOfFour(n));
    }

    private static boolean isPowerOfFour(int n) {
        if((n>0) && (n & (n-1)) == 0){
            int zeroCount = 0;
            while(n > 1){
                zeroCount++;
                n>>=1;
            }
            return zeroCount%2 == 0;
        }
        return false;
    }
}
