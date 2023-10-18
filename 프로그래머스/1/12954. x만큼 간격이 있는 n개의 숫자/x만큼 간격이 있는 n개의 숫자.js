function solution(x, n) {
    var answer = [];
    for(var i=x; n>0; i+=x, n--){
        answer.push(i);
    }
    return answer;
}