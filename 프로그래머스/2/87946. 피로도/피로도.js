function solution(k, dungeons) {
    var answer = 0;
    let visited = Array(dungeons.length).fill(false);
    
    const dfs = (cnt) => {
        for(let i=0; i<dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                k -= dungeons[i][1];
                
                answer = Math.max(cnt+1, answer);
                dfs(cnt+1);
                
                visited[i] = false;
                k += dungeons[i][1];
            }
        }
    }
    
    dfs(0);
        
    return answer;
}