function solution(edges) {
    var answer = [];
    let graph = {};
    
    edges.forEach(([a, b]) => {
        graph[a] ||= {sendCnt : 0, receiveCnt :0};
        graph[b] ||= {sendCnt : 0, receiveCnt :0};
        
        graph[a].sendCnt++;
        graph[b].receiveCnt++;
    })
    
    let newNode;
    let eight = 0, bar = 0;
    
    for(let node in graph) {
        const {sendCnt, receiveCnt} = graph[node];
        
        if(sendCnt >= 2 && receiveCnt === 0) {
            newNode = parseInt(node);
        } else if(sendCnt >= 2 && receiveCnt >= 2) {
            eight++;
        } else if(sendCnt === 0) {
            bar++;
        }
    }
    let donut = graph[newNode].sendCnt - eight - bar;
    
    return [newNode, donut, bar, eight];
}