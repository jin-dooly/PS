function solution(dartResult) {
    var answer = [0,0,0];
    let idx = -1;
    for(var i=0; i<dartResult.length; i++) {
        let s = dartResult[i];
        
        if(i>0 && s==='0' && dartResult[i-1] === '1') {
            answer[idx] = 10;
        }
        else if(s >= '0' && s <= '9') {
            idx++;
            answer[idx] = Number(s);
        }
        else if(s === 'D') {
            answer[idx] = answer[idx]**2;
        }
        else if(s === 'T') {
            answer[idx] = answer[idx]**3;
        }
        else if(s === '*') {
            answer[idx] *= 2;
            idx-1 >= 0 && (answer[idx-1] *= 2);
        }
        else if(s === '#') {
            answer[idx] *= -1;
        }
    }
    return answer.reduce((sum, cur) => sum + cur);
}