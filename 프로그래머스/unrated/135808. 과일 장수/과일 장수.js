function solution(k, m, score) {
    var answer = 0;
    score.sort((a,b) => b-a);
    for(var i=0; i<score.length; i+=m) {
        var slice = score.slice(i, i+m);
        if(slice.length < m) return answer;
        answer += Math.min(slice[m-1], k) * m;
    }
    return answer;
}