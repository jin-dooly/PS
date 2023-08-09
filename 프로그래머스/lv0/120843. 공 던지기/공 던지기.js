function solution(numbers, k) {
    return (k*2-1)%numbers.length || numbers.length;
}