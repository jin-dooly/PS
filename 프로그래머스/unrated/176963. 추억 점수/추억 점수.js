function solution(name, yearning, photo) {
    var answer = [];
    for(p of photo) {
        var cnt = 0;
        p.forEach(e => cnt += (yearning[name.indexOf(e)] || 0));
        answer.push(cnt);
    }
    return answer;
}