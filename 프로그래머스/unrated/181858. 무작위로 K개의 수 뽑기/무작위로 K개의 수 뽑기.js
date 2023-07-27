function solution(arr, k) {
    var answer = [];
    for(e of arr){
        if(!answer.includes(e)) answer.push(e);
        if(answer.length >= k) return answer;
    }
    for(var i=answer.length; i<k; i++){
        answer.push(-1);
    }
    return answer;
}