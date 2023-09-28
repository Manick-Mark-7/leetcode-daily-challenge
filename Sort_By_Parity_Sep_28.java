package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;

public class Sort_By_Parity_Sep_28 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            while(i<j && nums[i]%2==0)
                i++;
            while(i<j && nums[i]%2==1)
                j--;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
