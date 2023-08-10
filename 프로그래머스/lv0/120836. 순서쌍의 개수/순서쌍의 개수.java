class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        for(; i<=(n/i); i++){
            if(n%i == 0){
                if(i == n/i){ return answer*2+1; }
                answer++;
            }
        }
        return answer*2;
    }
}