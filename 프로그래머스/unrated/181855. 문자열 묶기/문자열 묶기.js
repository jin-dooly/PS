function solution(strArr) {
    var answer = new Array(31).fill(0);
    strArr.map((e) => {
        answer[e.length]++;
    });
    return answer.sort()[30];
}