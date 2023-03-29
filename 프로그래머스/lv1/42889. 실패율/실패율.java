import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[] fail = new float[N];
        Arrays.fill(answer, 0);
        int challenger=stages.length;
        
        for(int i=0; i<challenger; i++){
            if(stages[i]-1==N) continue;
            answer[stages[i]-1]++;
        }
        
        for(int i=0; i<N; i++){
            if(challenger<=0) {
                fail[i] = 0;
                continue;
            }
            fail[i] = (float)answer[i]/challenger;
            challenger -= answer[i];
        }
        
        for(int i=0; i<N; i++){
            float max = -1;
            int ind = -1;
            for(int j=0; j<N; j++){
                if(max<fail[j]){
                    ind = j;
                    max = fail[j];
                }
            }
            answer[i] = ind+1;
            fail[ind] = -1;
        }
        return answer;
    }
}