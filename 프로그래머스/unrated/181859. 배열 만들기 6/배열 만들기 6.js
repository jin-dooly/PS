function solution(arr) {
    var answer = [];
    for(var i=0; i<arr.length; i++){
        if(!answer.length){
            answer.push(arr[i]);
        }else if(answer[answer.length-1]==arr[i]){
            answer = answer.slice(0, answer.length-1);
        }else{
            answer.push(arr[i]);
        }
    }
    return answer.length ? answer : [-1];
}