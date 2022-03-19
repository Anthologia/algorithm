package main.level1.로또의최고순위와최저순위;

public class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {

        int zeroCnt = 0;
        int correctCnt = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCnt++;
            } else {
                for (int ans : win_nums) {
                    if (num == ans) {
                        correctCnt++;
                        break;
                    }
                }
            }
        }

        int bestRank = Math.min(7 - (zeroCnt + correctCnt), 6);
        int worstRank = Math.min(7 - correctCnt, 6);

        return new int[]{bestRank, worstRank};
    }
}
