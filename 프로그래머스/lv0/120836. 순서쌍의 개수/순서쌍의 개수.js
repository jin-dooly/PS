function solution(n) {
    var answer = 0;
    for(var i=1; i<=Math.sqrt(n); i++){
        if(n%i===0){
            if(n/i === i) answer++;
            else answer+=2;
        }
    }
    return answer;
}