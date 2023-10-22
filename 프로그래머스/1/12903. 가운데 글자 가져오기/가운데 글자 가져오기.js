function solution(s) {
    if(s.length%2==0)
    var answer = [...s].splice(Math.floor(s.length/2)-1, 2);
    else
    var answer = [...s].splice(Math.floor(s.length/2), 1);
    
    return answer.join('');
}