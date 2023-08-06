function solution(board) {
    var answer = 0;
    var n = board.length;
    for(var i=0; i<n; i++){
        for(var j=0; j<n; j++){
            if(board[i][j] === 0){
                for(var ii=i-1; ii<i+2; ii++){
                    if(ii<0 || ii>=n) continue;
                    for(var jj=j-1; jj<j+2; jj++){
                        if(jj<0 || jj>=n) continue;
                        if(board[ii][jj] === 1) {
                            board[i][j] = 2;
                        }
                    }
                }
                if(board[i][j]===0) answer++;
            }
        }
    }
    return answer;
}