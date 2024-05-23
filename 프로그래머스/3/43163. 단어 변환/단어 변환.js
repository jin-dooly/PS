function solution(begin, target, words) {
    if(!words.includes(target)) return 0;
    
    const isPossibleChange = (a, b) => {
        let diffCnt = 0;
        for(let i=0; i<a.length; i++) {
            a[i] !== b[i] && diffCnt++;
        }
        return diffCnt === 1
    }
    
    let visited = [];
    let queue = [[begin, 0]];
    
    while(queue.length) {
        const [str, cnt] = queue.shift();
        
        if(str === target) {
            return cnt;
        }
        
        words.forEach((word, idx) => {
            if(isPossibleChange(str, word)) {
                words[idx] = "";
                queue.push([word, cnt+1]);
            }
        })
    }
    
    return 0;
}