package leetcode.binarySearch.daily_challenge;

public class Decoded_String_At_Index_Sep_27 {
    public static void main(String[] args) {
        String s = "leet2code3";
        int k =10;
        String ans = decodeAtIndex(s,k);
        System.out.println(ans);
    }

    private static String decodeAtIndex(String s, int k) {
        public String decodeAtIndex(String s, int k) {
            long length = 0;
            int i = 0;

            while (length < k) {
                if (Character.isDigit(s.charAt(i))) {
                    length *= s.charAt(i) - '0';
                } else {
                    length++;
                }
                i++;
            }

            for (int j = i - 1; j >= 0; j--) {
                if (Character.isDigit(s.charAt(j))) {
                    length /= s.charAt(j) - '0';
                    k %= length;
                } else {
                    if (k == 0 || k == length) {
                        return Character.toString(s.charAt(j));
                    }
                    length--;
                }
            }

            return "";
    }
}
