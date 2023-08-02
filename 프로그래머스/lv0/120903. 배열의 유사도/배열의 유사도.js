function solution(s1, s2) {
    var answer = 0;
    var set = new Set(s1);
    s2.map(e => {
        if(set.has(e)) answer++;
    })
    return answer;
}