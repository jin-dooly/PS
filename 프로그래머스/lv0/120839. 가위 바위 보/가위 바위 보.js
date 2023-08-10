function solution(rsp) {
    var answer = '';
    var win = {
        '2': '0',
        '0': '5',
        '5': '2'
    }
    for(e of rsp){
        answer+= win[e];
    }
    return answer;
}