function solution(number, limit, power) {
    var answer = 0;
    for(var i=1; i<=number; i++){
        var measure = 0;
        for(var j=1; j<=Math.sqrt(i); j++){
            if(i%j==0) {
                if(i/j === j) measure++;
                else measure+=2;
            }
        }
        answer += measure > limit ? power : measure;
    }
    return answer;
}