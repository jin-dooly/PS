function solution(s) {
    var answer = 0;
    
    for(var i=0; i<s.length; i++){
        var otherCnt = 0;
        var xCnt = 0;
        var x = s[i];
        while(i<s.length){
            var ch = s[i++];
            if(ch !== x){
                otherCnt++;
            }
            else {
                xCnt++;
            }
            if(x !== ch && xCnt === otherCnt) break;
        }
        i--;
        answer++;
    }
    return answer;
}