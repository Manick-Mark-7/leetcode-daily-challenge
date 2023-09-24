package leetcode.binarySearch.daily_challenge;

public class Champagne_Tower_Sep_24 {
    //Find the glass in the particular row how much it filled 
    public static void main(String[] args) {
        int poured = 2;
        int query_row = 1;
        int query_glass = 1;
        double ans = champagneTower(poured,query_row,query_glass);
        System.out.println(ans);
    }

    private static double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[query_row+1][query_row+1];
        tower[0][0] = (double) poured;

        for(int row = 0; row<query_row;row++){
            for(int glass = 0;glass<=row;glass++){
                double excess = (tower[row][glass]-1.0)/2.0;
                if(excess > 0){
                    tower[row+1][glass]+=excess;
                    tower[row+1][glass+1]+=excess;
                }
            }
        }
        return Math.min(1.0,tower[query_row][query_glass]);
    }
}
