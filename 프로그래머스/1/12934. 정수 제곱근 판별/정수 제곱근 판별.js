function solution(n) {
    var sqrt = Math.sqrt(n);
    return sqrt === Math.floor(sqrt) ? (sqrt+1)**2 : -1;
}