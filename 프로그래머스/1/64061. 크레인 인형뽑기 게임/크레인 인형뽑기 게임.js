function solution(board, moves) {
    var answer = 0;
    var arr = [];
    moves.forEach((col) => {
        for(var row=0; row<board.length; row++) {
            var n = board[row][col-1]
            if(n) {
                board[row][col-1] = 0;
                if(arr[arr.length-1] === n) {
                    arr.pop();
                    answer += 2;
                }
                else arr.push(n);
                break;
            }
        }
    })
    return answer;
}