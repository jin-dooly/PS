function solution(s) {
    var answer = [];
    let idx = {}
    for(var i=0; i<s.length; i++){
        let ch = s[i];
        if(idx[ch] != undefined){
            answer.push(i - idx[ch]);
        }else{
            answer.push(-1);
        }
        idx[ch] = i;
    }
    return answer;
}