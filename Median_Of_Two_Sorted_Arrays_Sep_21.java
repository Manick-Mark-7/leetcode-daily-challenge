package leetcode.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median_Of_Two_Sorted_Arrays_Sep_21 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double ans =   findMedianSortedArray(nums1,nums2);
        System.out.println(ans);
    }

    private static double findMedianSortedArray(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i :nums1){
            list.add(i);
        }

        for(int j :nums2){
            list.add(j);
        }

        Collections.sort(list);
        int total = list.size();
        if(total%2 == 1)
            return (double)(list.get(total/2));
        else{
            int left = list.get(total/2-1);
            int right = list.get(total/2);
            return ((double)left+(double)right)/2.0;
        }
    }
}
