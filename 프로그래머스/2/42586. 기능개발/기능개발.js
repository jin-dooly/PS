function solution(progresses, speeds) {
    var answer = [];
    const days = progresses.map((p, i) => Math.ceil((100 - p) / speeds[i]))
    // console.log(days)
    let begin = days[0];
    let cnt = 1;
    for(let i=1; i<days.length; i++) {
        if(begin < days[i]) {
            answer.push(cnt);
            cnt = 1;
            begin = days[i];
        }else {
            cnt++;
        }
    }
    answer.push(cnt)
    return answer;
}