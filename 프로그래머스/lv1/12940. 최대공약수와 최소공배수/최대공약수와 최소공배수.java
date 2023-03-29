class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        if(max%min == 0){
            answer[0] = min;
            answer[1] = max;
            return answer;
        }
        for(int i=1; i<min; i++){
            if(min%i==0 && max%i==0)
                answer[0] = i;
        }
        answer[1] = min * (max/answer[0]);
        return answer;
    }
}