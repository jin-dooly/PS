class Solution {
    public int solution(int number, int limit, int power) {
        if(number==1) return 1;
        int answer = 1;
        int cnt = 0;
        int divisor = 0;
        for(int i=2; i<=number; i++){
            cnt = 0;
            for(int j=1; j*j<=i; j++){
                if(i%j==0) cnt+=2;
                if(j*j==i) cnt--;
                if(cnt>limit){
                    cnt = power;
                    break;
                }
            }
            answer += cnt;
        }
        return answer;
    }
}