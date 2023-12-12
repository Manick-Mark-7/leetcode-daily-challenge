package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;
import java.util.Random;

public class Maximum_Product_Of_Elements_In_An_Array_Dec_12 {
    public static void main(String[] args) {
        int[] arr = new int[6]; //size = 5;
        Random rand = new Random();
        for(int i=0;i<6;i++){
            arr[i] = rand.nextInt(20);
        }
        System.out.println("The given Array is "+ Arrays.toString(arr));
        int ans = maxProduct(arr);
        System.out.println("The max product is:"+ans);
    }
    public static int maxProduct(int[] nums) {
        int first = nums[0];
        int second = nums[1];

        if(second>first){
            int temp = first;
            first = second;
            second = temp;
        }
        for(int i=2;i<nums.length;i++){
            if(nums[i]>first){
                second = first;
                first = nums[i];
            }
            else if(nums[i]>second)
                second = nums[i];
        }
        return ((first-1)*(second-1));
    }

}
