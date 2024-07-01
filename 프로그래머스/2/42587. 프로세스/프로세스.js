function solution(priorities, location) {
    var answer = 0;
    const queue = priorities.map((priority, idx) => ({idx:idx, priority:priority}))
    priorities.sort((a, b) => a - b);
    while(queue.length) {
        const max = priorities.pop()
        let process = queue.shift();
        while(process.priority !== max){
            queue.push(process);
            process = queue.shift();
        }
        answer++;
        if(process.idx === location) break;
    }
    return answer;
}