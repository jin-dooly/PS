function solution(myString) {
    var answer = [];
    for(e of myString.split('x')){
        if(e!=='') answer.push(e);
    }
    return answer.sort();
}