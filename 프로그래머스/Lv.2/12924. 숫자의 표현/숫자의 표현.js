function solution(n) {
    var answer = 0;
    for(var i=n; i>=1; i--) {
        let tmp = n;
        for(var j=i; j>=1; j--) {
            tmp -= j;
            if(tmp <= 0) {
                if(tmp === 0) answer++
                break
            }
        }
    }
    return answer;
}