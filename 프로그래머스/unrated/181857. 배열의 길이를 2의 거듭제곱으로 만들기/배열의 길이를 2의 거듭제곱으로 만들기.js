function solution(arr) {
    var answer = arr;
    var len=1;
    for(; len<arr.length; len*=2){}
    for(var i=arr.length; i<len; i++){
        answer.push(0);
    }
    return answer;
}