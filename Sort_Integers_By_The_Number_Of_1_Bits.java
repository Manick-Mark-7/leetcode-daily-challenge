package leetcode.binarySearch;

import java.util.Arrays;

public class Sort_Integers_By_The_Number_Of_1_Bits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] ans= sortByBits(arr);
        System.out.println(ans);
    }

    private static int[] sortByBits(int[] arr) {
        Integer[] ans = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(ans,(a,b)->{
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return countA==countB?a-b:countA-countB;
        });
        return Arrays.stream(ans).mapToInt(Integer::intValue).toArray();
    }
}
