package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;

public class Eliminate_Maximum_Number_Of_Monsters_Oct_07 {
    public static void main(String[] args) {
        int[] dist = {1,3,4};
        int[] speed= {1,1,1};
        System.out.println(eliminateMaximum(dist,speed));
    }

    private static int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] time_to_city = new double[n];

        for (int i = 0; i < n; i++) {
            time_to_city[i] = (double)dist[i] / speed[i];
        }

        Arrays.sort(time_to_city);

        for (int i = 0; i < n; i++) {
            if (time_to_city[i] <= i) {
                return i;
            }
        }

        return n;

    }

}
