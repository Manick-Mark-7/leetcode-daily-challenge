package leetcode.binarySearch.daily_challenge;

import java.util.HashMap;
import java.util.Map;

public class Find_Element_Occuring_Once_When_All_Other_Are_Present_Thrice_Jan_04 {
    public static void main(String[] args) {
        int[] arr = {1,10,1,1};
        int n = arr.length;
        int ans = singleElement(arr,n);
        System.out.println(ans);
    }

    private static int singleElement(int[] arr, int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:arr){
            if(map.get(i)==1) return i;
        }
        return -1;
    }
}
