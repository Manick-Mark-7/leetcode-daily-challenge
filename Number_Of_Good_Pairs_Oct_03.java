package leetcode.binarySearch.daily_challenge;

import java.util.HashMap;

public class Number_Of_Good_Pairs_Oct_03 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans;
        try{
            ans = numIdenticalPairs(nums);
            System.out.println(ans);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            count+=map.get(i)-1;
        }
        return count;
    }
}
