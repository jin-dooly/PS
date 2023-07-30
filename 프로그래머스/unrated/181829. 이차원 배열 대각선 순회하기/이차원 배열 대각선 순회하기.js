function solution(board, k) {
    var answer = 0;
    for(var i=0; i<board.length; i++){
        for(var j=0; j<board[0].length; j++){
            if(i + j <= k) answer += board[i][j];
        }
    }
    return answer;
}