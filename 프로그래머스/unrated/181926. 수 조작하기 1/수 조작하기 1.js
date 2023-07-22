function solution(n, control) {
    var answer = n;
    var ctr = {
        "w" : 1,
        "s" : -1,
        "d" : 10,
        "a" : -10,
    };
    for(var i=0; i<control.length; i++){
        answer += ctr[control.charAt(i)];
    }
    return answer;
}