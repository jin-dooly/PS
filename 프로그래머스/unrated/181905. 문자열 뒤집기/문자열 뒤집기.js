function solution(my_string, s, e) {
    var front = my_string.substring(0, s);
    var sub = my_string.substring(s, e+1);
    var back = my_string.substr(e+1);
    sub = sub.split('').reverse().join('');
    return front+sub+back;
}