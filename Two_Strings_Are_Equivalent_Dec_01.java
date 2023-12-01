package geeks_for_geeks;

public class Two_Strings_Are_Equivalent_Dec_01 {
    public static void main(String[] args) {
        String[] word1 = {"ab" , "c"};
        String[] word2 = {"a" , "bc"};
        arrayStringsAreEqual(word1,word2);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s1:word1){
            sb1.append(s1);
        }
        for(String s2:word2){
            sb2.append(s2);
        }

        return sb1.toString().equals(sb2.toString());
    }
}
