package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;
import java.util.Random;

public class Element_Appearing_More_Than_25_In_Sorted_Array_Dec_12 {
    public static void main(String[] args) {
        int[] arr = new int[6]; //size = 5;
        Random rand = new Random();
        for(int i=0;i<6;i++){
            arr[i] = rand.nextInt(20);
        }
        System.out.println("The given Array is "+ Arrays.toString(arr));
        int ans = findSpecialInteger(arr);
        System.out.println("The special integer in the given Array is "+ans);
    }

    public static int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int qtr = len/4;
        int count = 1;
        int p = arr[0];
        for(int i=1;i<len;i++){
            if(p==arr[i]) count+=1;
            else count = 1;

            if(count>qtr) return arr[i];

            p= arr[i];
        }
        return p;
    }
}
