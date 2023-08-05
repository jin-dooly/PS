function solution(numlist, n) {
    var answer = [];
    return numlist.sort((a,b) => Math.abs(n-a)-Math.abs(n-b)||b-a);
}