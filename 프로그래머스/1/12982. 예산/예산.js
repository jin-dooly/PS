function solution(d, budget) {
    var bud = budget;
    return d.sort((a, b) => a-b).reduce((count, cur) => {
        if(bud - cur >= 0) {
            bud -= cur;
            return count +1;
        }
        return count
    }, 0);
}