function solution(l, r) {
    var answer = [];
    for(var i=l; i<=r; i++){
        if((i+'').replace(/0|5/g, "")==''){
            answer.push(i);
        }
    }
    return answer.length ? answer : [-1];
}