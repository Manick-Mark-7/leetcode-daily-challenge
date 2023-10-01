package leetcode.binarySearch.daily_challenge;

public class Reverse_Words_In_A_String_3_Oct_01 {
    public static void main(String[] args) {
        String s = "Hello My Name is Manick";
        String reverse = reverseWords(s);
        System.out.println(reverse);
    }

    private static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : arr){
            sb.append(new StringBuilder(word).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
