package leetcode.binarySearch.daily_challenge;

public class Remove_Colored_Pieces_Oct_02 {
    public static void main(String[] args) {
        String colors = "AAABABB";
        System.out.println(winnerOfGame(colors));
    }

    private static boolean winnerOfGame(String colors) {
        int aliceTurns =0;
        int bobTurns = 0;
        int count = 0;
        int len = colors.length();

        for(int i=1;i<len;i++){
            if(colors.charAt(i) == colors.charAt(i-1))
                count++;
            else{
                if(colors.charAt(i-1)=='A')
                    aliceTurns+=Math.max(0,count-1);
                else
                    bobTurns+=Math.max(0,count-1);
                count = 0;
            }
        }
        if(colors.charAt(len-1)=='A')
            aliceTurns+=Math.max(0,count-1);
        else
            bobTurns+=Math.max(0,count-1);

        return aliceTurns>bobTurns;
    }
}
