function solution(arr, k) {
    if(k%2==1) return arr.map(n => n*k);
    return arr.map(n => n+k)
}