function solution(numbers, n) {
    var answer = 0;
    for(var i=0; answer<=n; i++){
        answer += numbers[i];
    }
    return answer;
}