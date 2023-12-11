function solution(n) {
    var answer = new Array(n+1).fill(true);
    for(i=2; i<=n; i++) {
        if(!answer[i]) continue;
        for(j=i*2; j<=n; j+=i){
            if(!answer) continue;
            answer[j] = false;
        }
    }
    return answer.filter(n => n).length - 2;
}