class Solution {
    public int solution(int n) {
        int answer = n <= 1 ? n : n+1 ;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}