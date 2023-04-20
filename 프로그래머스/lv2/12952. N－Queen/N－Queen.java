class Solution {
    static int N, answer=0;
    static boolean[][] queen;
    static void dfs(int n, int m){
        if(!check(n,m)) return;

        if(n>=0) queen[n][m] = true;
        if(n==N-1) {
            answer++;
            return;
        }

        for(int i=0; i<N; i++)
            dfs(n+1, i);
        
        if(n>=0) queen[n][m] = false;
    }
    static boolean check(int n, int m){
        for(int i=0; i<n; i++){
            if(queen[i][m]) return false;
            int k = n-i;
            if(m+k<N && queen[i][m+k]) return false;
            if(m-k>=0 && queen[i][m-k]) return false;
        }
        return true;
    }
    public int solution(int n) {
        N = n;
        queen = new boolean[n][n];
        dfs(-1,0);
        return answer;
    }
}