class Solution {
    public int[] solution(int[][] score) {
        int len = score.length, cnt=1;
        int[] answer = new int[len];
        double[] avg = new double[len];
        
        for(int i=0; i<len; i++){
            avg[i] = (score[i][0]+score[i][1])/2.0;
        }
        for(int i=0; i<len; i++){
            answer[i] = len+1;
            for(int j=0; j<len; j++){
                if(avg[i] >= avg[j])
                    answer[i]--;
            }
        }
        return answer;
    }
}