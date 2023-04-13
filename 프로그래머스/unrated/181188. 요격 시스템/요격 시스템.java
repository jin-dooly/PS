import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        Arrays.sort(targets, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int[] range = new int[]{targets[0][0],targets[0][1]};
        for (int i=0; i<targets.length; i++) {
            if(range[1] > targets[i][0]) {
                range[0] = targets[i][0];
                range[1] = Math.min(range[1], targets[i][1]);
            }else{
                answer++;
                range[0] = targets[i][0];
                range[1] = targets[i][1];
            }
        }
        return answer;
    }
}