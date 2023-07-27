function solution(arr, flag) {
    var answer = [];
    for(var i=0; i<arr.length; i++){
        if(flag[i]){
            for(var j=0; j<arr[i]*2; j++){
                answer.push(arr[i]);
            }
        }else{
            answer = answer.slice(0, answer.length-arr[i]);
        }
    }
    return answer;
}