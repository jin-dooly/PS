function solution(s){
    var answer = 0;
    for(cur of s){
        cur === ')' ? answer-- : answer++
        if(answer < 0) return false
    }

    return answer ? false : true;
}