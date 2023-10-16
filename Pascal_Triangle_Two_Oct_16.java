package leetcode.binarySearch.daily_challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pascal_Triangle_Two_Oct_16 {
    public static void main(String[] args) {
        int row = new Random().nextInt(10);
        List<Integer> list = getRow(row);
        System.out.println(list);
    }

    private static List<Integer> getRow(int row) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long pre = 1;
        for(int i=1;i<row;i++){
            long val = pre*(row-i+1)/i;
            ans.add((int)val);
            pre = val;
        }
        return ans;
    }
}
