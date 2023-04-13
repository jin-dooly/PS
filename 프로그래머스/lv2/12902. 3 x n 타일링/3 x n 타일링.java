class Solution { //4*f(n-2)-f(n-4)
    public int solution(int n) {
        if(n%2 == 1) return 0;
        
        long[] answer = new long[n/2+1];
        answer[1] = 3;
        if(n == 2) return (int)answer[1];
        answer[2] = 11;
        if(n == 4) return (int)answer[2];
        
        int mod = 1000000007;
        for(int i=3; i<=n/2; i++){
            answer[i] = (4*answer[i-1]%mod - answer[i-2]%mod + mod)%mod;
        }
        
        return (int) answer[n/2];
    }
}