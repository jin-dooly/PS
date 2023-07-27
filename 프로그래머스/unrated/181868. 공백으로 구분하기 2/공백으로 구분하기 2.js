function solution(my_string) {
    var answer = [];
    for(e of my_string.split(" ")){
        if(e!=='') answer.push(e);
    }
    return answer;
}