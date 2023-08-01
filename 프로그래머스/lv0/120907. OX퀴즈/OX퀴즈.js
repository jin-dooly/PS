function solution(quiz) {
    var answer = [];
    quiz.map(str => {
        var arr = str.split(" ");
        var x = Number(arr[0]);
        var y = Number(arr[2]);
        var z = Number(arr[4]);
        if(arr[1]=="+" && x+y===z) answer.push("O");
        else if(arr[1]=="-" && x-y===z) answer.push("O");
        else answer.push("X");
    })
    return answer;
}