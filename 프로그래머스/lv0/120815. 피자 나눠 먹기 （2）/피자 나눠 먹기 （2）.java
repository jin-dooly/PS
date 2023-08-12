class Solution {
    public int solution(int n) {
        int answer = 0, cnt = 0;
        while(true){
            cnt++;
            if((6*cnt)%n==0){
                answer = cnt;
                break;
            }
        }
        return answer;
    }
}