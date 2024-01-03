function solution(s) {
    var answer = [0, 0];
    while(s !== '1') {
        preLength = s.length;
        nextLength = s.replaceAll('0', '').length;
        answer[0]++;
        answer[1] += preLength - nextLength;
        s = nextLength.toString(2)
    }
    return answer;
}