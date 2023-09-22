function solution(left, right) {
    var answer = 0;
    for(var num=left; num<=right; num++) {
        var measure = new Set();
        for(var i=1; i<=Math.sqrt(num, 2); i++) {
            if(num%i==0) {
                measure.add(i);
                measure.add(num/i);
            }
        }
        var len = measure.size;
        answer += (len%2===0 ? num : -1*num);
    }
    return answer;
}