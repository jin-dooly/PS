function solution(numLog) {
    var answer = '';
    for(var i=0; i<numLog.length-1; i++){
        var tmp = numLog[i+1]-numLog[i];
        if(tmp==1){
            answer+="w";
        }else if(tmp==-1){
            answer+="s";
        }else if(tmp==10){
            answer+="d";
        }else{
            answer+="a";
        }
    }
    return answer;
}