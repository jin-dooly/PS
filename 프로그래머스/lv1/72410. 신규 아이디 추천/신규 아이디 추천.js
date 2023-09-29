function solution(new_id) {
    var answer = (new_id.toLowerCase()
        .replace(/[^0-9a-z\-\.\_]/g, '')
        .replace(/\.+/g,'.')
        .replace(/^\.|\.$/, '')||'a')
        .substr(0, 15)
        .replace(/\.$/, '');
    const len = answer.length;
    if(len < 3){
        answer += answer[len-1].repeat(3-len);
    }
    return answer;
}