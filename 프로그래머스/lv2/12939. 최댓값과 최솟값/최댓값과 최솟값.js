function solution(s) {
    var answer = s.split(' ').map(Number).sort((a, b) => (a-b));
    return `${answer[0]} ${answer[answer.length-1]}`;
}