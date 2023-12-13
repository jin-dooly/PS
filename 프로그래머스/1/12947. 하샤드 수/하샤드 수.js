function solution(x) {
    return x % [...x.toString()].map(Number).reduce((sum, cur) => sum+cur) === 0;
}