function solution(chicken) {
    var answer = 0;
    var res = chicken;
    while(res >= 10){
        answer += Math.floor(res/10);
        res = Math.floor(res/10) + res%10;
    }
    return answer;
}
