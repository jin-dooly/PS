function solution(a, b) {
    var answer = `${a}${b}`;
    answer = answer > `${b}${a}` ? answer : `${b}${a}`;
    return Number(answer);
}