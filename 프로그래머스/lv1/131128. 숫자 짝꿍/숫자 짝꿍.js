function solution(X, Y) {
    var answer = '';
    var x = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0];
    var y = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0];
    [...X].forEach(n => x[n]++);
    [...Y].forEach(n => y[n]++);
    var xy = x.map((n, idx) => Math.min(n, y[idx]));
    
    for(var i=9; i>=0; i--) {
        answer += (i+'').repeat(xy[i])
    }
    
    if(!answer) return "-1"
    if(!answer.replace(/0/g, "")) return "0"
    return answer;
}