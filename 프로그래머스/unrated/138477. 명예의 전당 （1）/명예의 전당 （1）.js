function solution(k, score) {
    var answer = [];
    //stack
    var stack = [];
    score.forEach(e => {
        if(stack.length===0) stack.push(e);
        else{
            var pop = stack.pop();
            var max = Math.max(e, pop);
            var min = Math.min(e, pop);
            stack.push(max);
            if(stack.length < k) stack.push(min);
        }
        stack.sort((a,b) => b-a);
        answer.push(stack[stack.length-1]);
    })
    return answer;
}