function solution(n) {
    var answer = 0;
    if(n%2!==0){
        answer = (n+1)/4 * (n+1);
    }else{
        for(var i=n; i>0; i-=2){
            answer += i*i;
        }
    }
    return answer;
}