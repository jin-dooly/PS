function solution(my_string, indices) {
    var answer = my_string.split('');
    for(var i=0; i<indices.length; i++){
        answer[indices[i]] = '';
    }
    return answer.join('');
}