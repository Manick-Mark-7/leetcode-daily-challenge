package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;

public class Minimize_Maximum_Pair_Sum_Oct_17 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 3};
        System.out.println(minPairSum(nums));
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int ans = Integer.MIN_VALUE;
        while (left < right) {
            int currentPairSum = nums[left] + nums[right];
            ans = Math.max(currentPairSum, ans);
            left++;
            right--;
        }
        return ans;
    }
}
