function solution(my_string) {
    var arr = my_string.split(" ");
    var answer = Number(arr[0]);
    for(var i=1; i<arr.length; i+=2){
        if(arr[i]=="+") answer += Number(arr[i+1]);
        else answer -= Number(arr[i+1]);
    }
    return answer;
}