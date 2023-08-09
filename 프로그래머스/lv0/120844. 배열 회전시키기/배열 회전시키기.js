function solution(numbers, direction) {
    var len = numbers.length;
    if(direction === "right"){
        return [numbers[len-1], ...numbers.slice(0, len-1)];
    }
    return [...numbers.slice(1), numbers[0]];
}