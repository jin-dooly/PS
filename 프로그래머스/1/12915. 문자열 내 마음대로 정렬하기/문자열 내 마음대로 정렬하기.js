function solution(strings, n) {
    var answer = strings.sort().sort((a,b) => a.charCodeAt(n)-b.charCodeAt(n));
    return answer;
}