function solution(keyinput, board) {
    var answer = [0, 0];
    var width = Math.floor(board[0]/2);
    var height = Math.floor(board[1]/2);
    keyinput.map((key) => {
        if(key == 'up' && answer[1] < height) answer[1]++;
        else if(key == 'down' && answer[1] > -1*height) answer[1]--;
        else if(key == 'left' && answer[0] > -1*width) answer[0]--;
        else if(key == 'right' && answer[0] < width) answer[0]++;
    })
    return answer;
}