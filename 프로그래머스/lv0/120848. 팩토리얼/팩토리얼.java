class Solution {
    public int solution(int n) {
        int answer=1;
        int fac = 1;
        for(; (fac*=answer)<=n; answer++){
        }
        return answer-1;
    }
}