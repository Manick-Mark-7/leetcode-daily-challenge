package leetcode.binarySearch.daily_challenge;

public class Painting_The_Walls_Oct_14 {
    public static void main(String[] args) {
        int[] cost = {1,2,3,2};
        int[] time = {1,2,3,2};
        Painting_The_Walls_Oct_14 obj = new Painting_The_Walls_Oct_14();
        System.out.println(obj.paintWalls(cost,time));
    }
    public  int paintWalls(int[] cost, int[] time) {
        int n=cost.length;
        return (int)paintWallsHelper(cost,time,0,0,new Long[n][501]);
    }

    private static long paintWallsHelper(int[] cost, int[] time, int index, int total, Long[][] memo) {
        if(total >= cost.length)
            return 0;
        if(index >= cost.length)
            return Integer.MAX_VALUE;
        if(memo[index][total] != null)
            return memo[index][total];

        long with=cost[index] + paintWallsHelper(cost,time,index+1,total+time[index]+1,memo);
        long without=paintWallsHelper(cost,time,index+1,total,memo);
        return memo[index][total]=Math.min(with,without);
    }
}
