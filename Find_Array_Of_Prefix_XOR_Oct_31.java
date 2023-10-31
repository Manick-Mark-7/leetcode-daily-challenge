package leetcode.binarySearch.daily_challenge;

public class Find_Array_Of_Prefix_XOR_Oct_31 {
    public static void main(String[] args) {
        int[] pref = {5,2,0,3,1};
        int[] ans = findArray(pref);
        System.out.println(ans);
    }

    private static int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];
        if(n==1) return pref;
        ans[0] = pref[0];
        for(int i=1;i<n;i++){
            ans[i] = pref[i-1]^pref[i];
        }

        return ans;
    }
}
