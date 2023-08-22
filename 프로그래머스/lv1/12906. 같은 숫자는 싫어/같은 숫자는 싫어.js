function solution(arr)
{
    var stack = [];
    arr.forEach(e => {
        if(stack.length!==0){
            var pop = stack.pop();
            if(pop !== e) stack.push(pop);
        }
        stack.push(e);
    })
    
    return stack;
}