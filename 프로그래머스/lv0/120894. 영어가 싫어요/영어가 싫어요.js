function solution(numbers) {
    var answer = numbers;
    var num = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    for(var i=0; i<10; i++){
        answer = answer.replaceAll(num[i], i);
    }
    return parseInt(answer);
}