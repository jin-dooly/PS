function solution(score) {
    score = score.map((e)=> e[0]+e[1]);
    var score_sort = [...score].sort((a,b)=> b-a);
    var answer = [];
    score.map((e) => {
        answer.push(score_sort.indexOf(e)+1);
    })
    return answer;
}