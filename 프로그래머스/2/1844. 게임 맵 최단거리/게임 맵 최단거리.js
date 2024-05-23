function solution(maps) {
    const n = maps.length;
    const m = maps[0].length;
    let queue = [];
    
    const isPossible = (row, col) => {
        if(0 <= row && row < n && 0 <= col && col < m && maps[row][col]) {
            maps[row][col] = 0;
            return true
        }
        return false
    }
    
    maps[0][0] = 0;
    queue.push([0, 0, 1]);
    
    while(queue.length) {
        const [row, col, cnt] = queue.shift();
        
        if(row === n-1 && col === m-1) return cnt;
        
        if(isPossible(row-1, col)) queue.push([row-1, col, cnt+1]);
        if(isPossible(row, col-1)) queue.push([row, col-1, cnt+1]);
        if(isPossible(row+1, col)) queue.push([row+1, col, cnt+1]);
        if(isPossible(row, col+1)) queue.push([row, col+1, cnt+1]);
    }
    
    return -1;
}