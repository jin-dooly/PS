function solution(s){
    var answer = {p:0, y:0};
    [...s.toLowerCase()].forEach(ch => {
        if(ch === 'p') answer.p++;
        if(ch === 'y') answer.y++;
    })

    return answer.p === answer.y;
}