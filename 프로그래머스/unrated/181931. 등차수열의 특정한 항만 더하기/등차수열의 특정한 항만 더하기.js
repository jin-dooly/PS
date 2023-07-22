function solution(a, d, included) {
    var answer = 0;
    for(var i=a, idx=0; idx<included.length; i+=d, idx++){
        if(included[idx]){
            answer += i;
        }
    }
    return answer;
}