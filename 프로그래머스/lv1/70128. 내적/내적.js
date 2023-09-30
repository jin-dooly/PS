function solution(a, b) {
    return a.reduce((sum, n1, i) => sum+= n1*b[i], 0);
}