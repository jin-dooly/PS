function solution(numbers) {
    var len = numbers.length;
    numbers.sort((a,b) => b-a);
    return Math.max(numbers[0]*numbers[1], numbers[len-2]*numbers[len-1]);
}