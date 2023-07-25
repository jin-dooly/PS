function solution(myString, pat) {
    var answer = myString.toUpperCase().includes(pat.toUpperCase());
    return answer ? 1 : 0;
}