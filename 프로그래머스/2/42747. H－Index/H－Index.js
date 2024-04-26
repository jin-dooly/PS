function solution(citations) {
    citations.sort((a, b) => a-b);
    let cnt = 1
    for(let i=citations.length-1; i>=0; i--, cnt++) {
        if(citations[i] > cnt) continue;
        return citations[i] === cnt ? cnt : cnt-1
    }
    return cnt-1;
}