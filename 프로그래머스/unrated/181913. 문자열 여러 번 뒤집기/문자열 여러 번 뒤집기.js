function solution(my_string, queries) {
    var answer = my_string;
    queries.map(([s,e]) => {
        var front = answer.substring(0,s);
        var sub = answer.substring(s,e+1);
        var back = answer.substring(e+1, answer.length);
        sub = sub.split('').reverse().join('');
        answer = front + sub + back;
    })
    return answer;
}