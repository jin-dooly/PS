function solution(my_string, n) {
    var answer = '';
    [...my_string].forEach((e) => {
        for(var i=0; i<n; i++) answer+=e;
    })
    return answer;
}