function solution(k, tangerine) {
    var answer = 0;
    let cnt = {}
    tangerine.forEach((i) => {
        cnt[i] = cnt[i] !== undefined ? cnt[i] + 1 : 1;
    })
    cnt = Object.entries(cnt).sort((a, b) => b[1] - a[1])
    for([key, value] of cnt){
        answer++;
        k -= value;
        if(k <= 0) break;
    }
    return answer;
}