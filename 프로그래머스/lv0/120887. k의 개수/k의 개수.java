class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int tmp = 0;
        for(int n=i; n<=j; n++){
            tmp = n;
            while(tmp/10!=0 || tmp%10!=0){
                if(tmp%10==k) answer++;
                tmp/=10;
            }
        }
        return answer;
    }
}