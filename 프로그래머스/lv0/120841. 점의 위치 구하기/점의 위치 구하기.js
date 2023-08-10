function solution(dot) {
    var answer = 0;
    if(dot[1]>0){
        answer++;
        if(dot[0]<0) answer++;
    }
    else{
        answer=3;
        if(dot[0]>0) answer++;
    }
    return answer;
}