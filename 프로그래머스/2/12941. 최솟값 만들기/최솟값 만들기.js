function solution(A,B){
    B.sort((a, b) => b-a);
    return A.sort((a, b) => a-b).reduce((sum, cur, idx) => sum + cur * B[idx], 0)
}