function solution(arr, divisor) {
    var answer = arr.filter(n => n%divisor==0);
    return answer.length ? answer.sort((a,b) => a-b) : [-1];
}