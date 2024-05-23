function solution(n, computers) {
    var answer = 0;
    let needVisit = [];
    
    const bfs = () => {while(needVisit.length) {
        const node = needVisit.shift();
        if(!computers[node]) continue;
        computers[node].forEach((isConnect, idx) => {
            if(idx !== node && isConnect) needVisit.push(idx);
        })
        computers[node] = false;
    }}
    
    for(let i=0; i<n; i++) {
        if(!computers[i]) continue;
        needVisit.push(i);
        bfs();
        answer++;
    }
    
    return answer;
}