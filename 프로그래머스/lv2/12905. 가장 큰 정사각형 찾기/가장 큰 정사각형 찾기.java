class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        int row = board.length;
        int col = board[0].length;
        
        for(int i=0; i<row || i<col; i++){
            if((i<row && board[i][0]==1) || (i<col && board[0][i]==1)){
                answer = 1;
                break;
            }
        }
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(board[i][j]==0) continue;
                board[i][j] = Math.min(Math.min(board[i-1][j], board[i][j-1]), board[i-1][j-1])+1;
                
                answer = Math.max(answer, board[i][j]);
            }
        }
        return answer*answer;
    }
}