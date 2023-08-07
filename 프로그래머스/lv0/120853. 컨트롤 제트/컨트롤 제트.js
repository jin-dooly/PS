function solution(s) {
    var answer = 0;
    var arr = s.split(" ");
    for(var i=arr.length-1; i>=0; i--) {
        if(arr[i] === 'Z') i--;
        else answer += Number(arr[i]);
    }
    return answer;
}