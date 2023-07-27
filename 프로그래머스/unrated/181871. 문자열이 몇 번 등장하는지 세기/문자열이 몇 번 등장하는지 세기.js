function solution(myString, pat) {
    var answer = 0;
    for(var i=0; ;){
        i = myString.indexOf(pat, i)+1;
        if(i == 0)  break;
        answer++;
    }
    return answer;
}