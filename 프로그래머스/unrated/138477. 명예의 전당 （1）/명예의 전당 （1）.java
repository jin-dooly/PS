import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] recode = new int[k];
        Arrays.fill(recode,-1);
        for(int i=0; i<score.length; i++){
            if(recode[0]<score[i]){
                recode[0] = score[i];
            }
            Arrays.sort(recode);
            if(i<k-1){
                answer[i] = recode[k-i-1];
            }else{
                answer[i] = recode[0];
            }
        }
        
        
        return answer;
    }
}