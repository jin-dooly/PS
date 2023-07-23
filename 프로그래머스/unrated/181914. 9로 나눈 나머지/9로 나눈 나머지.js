function solution(number) {
    var answer = 0;
    for(var i=0; i<number.length; i++){
        answer += Number(number[i]);
    }
    return answer%9;
}