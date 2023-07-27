function solution(myString) {
    var answer = [];
    for(e of myString.split('x')){
        answer.push(e.length);
    }
    return answer;
}