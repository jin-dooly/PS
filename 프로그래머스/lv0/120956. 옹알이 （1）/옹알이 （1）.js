function solution(babbling) {
    var answer = 0;
    for(var str of babbling){
        str = str.replace(/aya|ye|woo|ma/g, " ");
        str = str.replace(/ /g, '');
        if(str === ''){
            answer++;
        }
    }
    return answer;
}