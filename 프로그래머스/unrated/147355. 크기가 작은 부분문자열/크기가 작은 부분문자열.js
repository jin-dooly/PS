function solution(t, p) {
    var answer = 0;
    let plen = p.length;
    p = Number(p);
    for(var i=0; i<=t.length-plen; i++){
        let tsub = Number(t.substr(i, plen));
        if(p >= tsub) answer++;
    }
    return answer;
}