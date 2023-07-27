function solution(myStr) {
    var answer = [];
    for(e of myStr.replace(/a|b|c/g," ").split(" ")){
        if(e!=='') answer.push(e);
    }
    return answer.length ? answer : ['EMPTY'];
}