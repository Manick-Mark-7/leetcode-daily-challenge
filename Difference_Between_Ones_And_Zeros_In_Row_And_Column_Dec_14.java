package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;

public class Difference_Between_Ones_And_Zeros_In_Row_And_Column_Dec_14 {
    public static void main(String[] args) {
        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
        int[][] ans = oneMinusZeroes(grid);
        System.out.print(Arrays.deepToString(ans));
    }


    private static int[][] oneMinusZeroes(int[][] grid){
        int[] rowOnes = new int[grid.length];
        int[] colOnes = new int[grid[0].length];

        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                rowOnes[i]+=grid[i][j];
                colOnes[j]+=grid[i][j];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j] = 2*(rowOnes[i]+colOnes[j])- grid.length-grid[0].length;
            }
        }
        return grid;
    }
}
