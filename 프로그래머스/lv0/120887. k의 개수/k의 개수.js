function solution(i, j, k) {
    var answer = 0;
    for(var n=i; n<=j; n++){
        answer += (n.toString().length) - (n.toString().replaceAll(k, "").length);
    }
    return answer;
}