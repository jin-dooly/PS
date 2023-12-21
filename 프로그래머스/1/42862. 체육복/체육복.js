function solution(n, lost, reserve) {
    let answer = n - lost.length;
    lost.sort((a,b) => a-b);
        
    reserve.forEach(res => {
        if(lost.includes(res)) {
            lost = lost.filter(l => l !== res);
            reserve = reserve.filter(r => r !== res);
            answer++;
        }
    })
        
    for(var i=0; i<lost.length && reserve.length>0; i++){
        if(reserve.includes(lost[i]-1)){
            answer++;
            reserve = reserve.filter(r => r !== lost[i]-1);
        }else if(reserve.includes(lost[i]+1)){
            answer++;
            reserve = reserve.filter(r => r !== lost[i]+1);
        }
    }
    return answer;
}