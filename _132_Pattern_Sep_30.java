package leetcode.binarySearch.daily_challenge;

import java.util.Stack;

public class _132_Pattern_Sep_30 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        boolean ans = find132pattern(nums);
        System.out.println(ans);
    }

    private static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] < third) return true;
            while(!stack.isEmpty() && stack.peek()<third)
                third = stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }
}
