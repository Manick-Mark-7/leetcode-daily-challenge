package geeks_for_geeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Winner_Of_An_Election_Dec_30 {
    public static void main(String[] args) {
        String[] arr = {"andy","blake","clark"};
        int n = arr.length;
        String[] ans = winner(arr,n);
        System.out.println(Arrays.toString(ans));
    }

    private static String[] winner(String[] arr, int n) {
        Map<String,Integer> map = new HashMap<>();
        String[] ans = new String[2];
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int max  = Integer.MIN_VALUE;
        for(String s:map.keySet()){
            if(map.get(s)>max){
                ans[0] = s;
                ans[1] = String.valueOf(map.get(s));
            }
            else if(map.get(s) == max){
                if(ans[0].compareTo(s)>0){
                    ans[0] = s;
                    ans[1] = String.valueOf(map.get(s));
                    max = map.get(s);
                }
            }

        }
        return ans;
    }
}
