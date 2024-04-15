function solution(s){
    let cnt = 0;
    
    for(let ch of s){
        if(ch === "(") cnt++;
        else cnt--;
        if(cnt < 0) return false;
    }
    return cnt === 0
}