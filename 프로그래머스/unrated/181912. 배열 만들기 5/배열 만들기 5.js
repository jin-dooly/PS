function solution(intStrs, k, s, l) {
    var answer = [];
    for(n of intStrs){
        var num = Number(n.substr(s, l));
        if(num > k) answer.push(num);
    }
    
    return answer;
}