package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;

public class Maximum_Element_After_Decreasing_And_Rearranging_Nov_15 {

    public static void main(String[] args) {
        int[] arr = {2,2,1,2,1};
        int ans = maximumElementAfterDecrementingAndRearranging(arr);
        System.out.println(ans);
    }
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int maxVal = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal += 1;
            }
        }

        return maxVal;
    }
}
