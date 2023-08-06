class Solution {
    public void danger(int[][] copy, int N, int X, int Y){
        for(int x=X-1; x<=X+1; x++){
            if(x<0 || x>=N){
                continue;
            }else{
                for(int y=Y-1; y<=Y+1; y++){
                    if(y<0 || y>=N){
                        continue;
                    }else{
                        copy[x][y] = 1;
                    }
                }
            }
        }
    }
    public int solution(int[][] board) {
        int answer = 0, n = board.length;
        int[][] copy = new int[n][n];
        
        for(int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                if(board[x][y]==1){
                    danger(copy, n, x, y);
                }
            }
        }
        for(int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                if(copy[x][y]==0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}