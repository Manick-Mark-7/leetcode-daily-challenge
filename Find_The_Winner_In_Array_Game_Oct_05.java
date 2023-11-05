package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;

public class Find_The_Winner_In_Array_Game_Oct_05 {
    public static void main(String[] args) {
        int[] arr ={2,1,3,5,4,6,7};
        int k =2;
        System.out.println(getWinner(arr,k));
     }

    private static int getWinner(int[] arr, int k) {
        if(k == 1 )
            return Math.max(arr[0], arr[1]);
        if(k>= arr.length)
            return Arrays.stream(arr).max().getAsInt();

        int current_winner = arr[0];
        int consecutive_wins = 0;

        for(int i=1;i<arr.length;i++){
            if(current_winner > arr[i])
                consecutive_wins++;
            else{
                current_winner = arr[i];
                consecutive_wins= 1;
            }
            if(consecutive_wins == k)
                return current_winner;
        }
        return current_winner;
    }
}
