function solution(arr) {
    var answer = arr;
    for(var i=0; i<arr.length; i++){
        var e = answer[i];
        if(e>=50 && e%2==0) {
            answer[i]/=2;
        }else if(e<50 && e%2==1) {
            answer[i] *=2;
        }
    }
    return answer;
}