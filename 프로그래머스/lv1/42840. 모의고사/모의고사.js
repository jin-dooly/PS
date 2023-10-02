function solution(answers) {
    var answer = [];
    var count = [];
    count[0] = answers.filter((n, idx) => idx%5+1 === n).length;
    var value = [2,1,2,3,2,4,2,5];
    count[1] = answers.filter((n, idx) => {
        if(value[idx%8] === n) return true;
        return false;
    }).length;
    value = [3,3,1,1,2,2,4,4,5,5];
    count[2] = answers.filter((n, idx) => {
        if(value[idx%10] === n) return true;
        return false;
    }).length;
    var max = Math.max(...count);
    return count.reduce((arr, cur, idx) => {
        if(cur === max) arr.push(idx+1);
        return arr;
    }, []);
}