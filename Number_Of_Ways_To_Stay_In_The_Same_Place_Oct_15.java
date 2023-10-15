package leetcode.binarySearch.daily_challenge;

public class Number_Of_Ways_To_Stay_In_The_Same_Place_Oct_15 {
    public int numWays(int steps, int arrLen) {
        int mod = 1_000_000_007;
        int maxColumn = Math.min(arrLen, steps / 2 + 1);
        int[] curr = new int[maxColumn + 1];
        int[] prev = new int[maxColumn + 1];
        prev[0] = 1;

        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j <= maxColumn; j++) {
                curr[j] = prev[j];
                if (j - 1 >= 0) {
                    curr[j] = (curr[j] + prev[j - 1]) % mod;
                }
                if (j + 1 < maxColumn) {
                    curr[j] = (curr[j] + prev[j + 1]) % mod;
                }
            }
            System.arraycopy(curr, 0, prev, 0, maxColumn + 1);
        }
        return prev[0];
    }
}
