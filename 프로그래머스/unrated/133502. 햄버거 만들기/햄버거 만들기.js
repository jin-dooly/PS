function solution(ingredient) {
    var answer = 0;
    let stack = [];
    for(var i=0; i<ingredient.length; i++){
        let ing = ingredient[i];
        stack.push(ing);
        if(ing === 1 && stack.slice(-4).join('') === '1231') {
            answer++;
            for(var j=0; j<4; j++) stack.pop();
        }
    }
    return answer;
}