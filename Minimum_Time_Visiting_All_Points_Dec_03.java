package leetcode.binarySearch.daily_challenge;

public class Minimum_Time_Visiting_All_Points_Dec_03 {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        int ans = minTimeToVisitAllPoints(points);
        System.out.println( ans);
    }


    private static int toTime(int[] from, int[] to) {
        int xDiff = Math.abs(from[0] - to[0]);
        int yDiff = Math.abs(from[1] - to[1]);

        return Math.max(xDiff, yDiff);
    }

    private static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 1; i < points.length; i++) {
            time += toTime(points[i - 1], points[i]);
        }

        return time;
    }
}
