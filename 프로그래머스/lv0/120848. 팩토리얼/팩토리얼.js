function solution(n) {
    var answer = 1;
    for(var i=1, acc=1; acc<=n; i++, acc*=i){
        answer = i;
    }
    return answer;
}