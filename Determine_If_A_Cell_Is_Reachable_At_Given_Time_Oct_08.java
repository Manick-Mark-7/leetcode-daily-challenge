package leetcode.binarySearch.daily_challenge;

public class Determine_If_A_Cell_Is_Reachable_At_Given_Time_Oct_08 {
    public static void main(String[] args) {
        System.out.println(isReachableAtTime(3,1,7,3,3));
    }
    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if((sx==fx) && (sy==fy)) return t!=1;

        return Math.max(Math.abs(fx-sx),Math.abs(fy-sy))<=t;
    }
}
