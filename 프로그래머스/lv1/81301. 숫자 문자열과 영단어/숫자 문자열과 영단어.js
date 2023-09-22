function solution(s) {
    var answer = 0;
    const number = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    for(var i=0; i<10; i++) {
        s = s.replaceAll(number[i], i);
    }
    return Number(s);
}