let pair = {
    "]" : "[",
    "}" : "{",
    ")" : "("
}

function test(s) {
    let stack = [];
    for(let i=0; i<s.length; i++) {
        if(!pair[s[i]]){
            stack.push(s[i]);
        } else if(!stack.length || stack[stack.length-1] !== pair[s[i]]) {
            return 0
        } else {
            stack.pop(); 
        }
    }
    if(stack.length) return 0;
    return 1;
}

function solution(s) {
    var answer = 0;
    for(let i=0; i<s.length; i++) {
        answer += test(s);
        s = s.slice(1) + s.charAt(0);
    }
    return answer;
}