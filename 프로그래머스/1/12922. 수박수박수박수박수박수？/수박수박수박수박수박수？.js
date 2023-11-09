function solution(n) {
    var answer = "수박".repeat(n/2);
    return n%2 === 1 ? answer+'수' : answer;
}