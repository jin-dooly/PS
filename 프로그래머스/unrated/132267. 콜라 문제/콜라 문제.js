function solution(a, b, n) {
    var answer = 0;
    let rest = n;
    let service = 0;
    while(rest >= a){
        service = Math.floor(rest/a)*b;
        rest = service + rest%a;
        answer += service;
    }
    return answer;
}