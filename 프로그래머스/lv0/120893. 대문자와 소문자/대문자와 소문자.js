function solution(my_string) {
    var answer = '';
    for(c of my_string){
        if(c === c.toUpperCase()) answer += c.toLowerCase();
        else answer += c.toUpperCase();
    }
    return answer;
}