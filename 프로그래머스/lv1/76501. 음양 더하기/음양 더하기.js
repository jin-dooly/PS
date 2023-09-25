function solution(absolutes, signs) {
    return absolutes.reduce((sum, num, idx) => {
        if(signs[idx]) return sum+num;
        return sum-num;
    }, 0);
}