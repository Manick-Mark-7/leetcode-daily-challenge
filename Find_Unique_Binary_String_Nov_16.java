package leetcode.binarySearch.daily_challenge;

public class Find_Unique_Binary_String_Nov_16 {
    public static void main(String[] args) {
        String[] nums = {"01","11"};
        System.out.println(findDifferentBinaryString(nums));
    }

    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i].charAt(i) == '0'?"1":"0");
        }
        return sb.toString();
    }
}
