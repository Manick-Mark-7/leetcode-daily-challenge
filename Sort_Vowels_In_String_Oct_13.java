package leetcode.binarySearch.daily_challenge;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Vowels_In_String_Oct_13 {
    public static void main(String[] args) {
        String inputString = "lEetcOde";
        System.out.println(sortVowels(inputString));
    }

    public static String sortVowels(String inputString) {
        int length = inputString.length();
        ArrayList<Character> vowelsList = new ArrayList<>();
        ArrayList<Integer> vowelPositions = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                    currentChar == 'o' || currentChar == 'u' || currentChar == 'A' ||
                    currentChar == 'E' || currentChar == 'I' || currentChar == 'O' ||
                    currentChar == 'U') {
                vowelsList.add(currentChar);
                vowelPositions.add(i);
            }
        }

        Collections.sort(vowelsList);

        char[] resultArray = inputString.toCharArray();
        for (int i = 0; i < vowelPositions.size(); i++) {
            resultArray[vowelPositions.get(i)] = vowelsList.get(i);
        }

        return new String(resultArray);
    }
}
