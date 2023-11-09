package leetcode.binarySearch.daily_challenge;

public class Count_Number_Of_Homogenous_Substring_Oct_09 {
    public static void main(String[] args) {
        String s = "abbcccaa";
       int ans =  countHomogenous(s);
        System.out.println(ans);
    }

    private static int countHomogenous(String s) {
        int left = 0;
        long res = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(left) == s.charAt(right)) {
                res += right - left + 1;
            } else {
                res += 1;
                left = right;
            }
        }

        return (int) (res % (1000000007));
    }
}
