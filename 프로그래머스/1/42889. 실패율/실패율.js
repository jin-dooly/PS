function solution(N, stages) {
    var count = new Array(N+2).fill(0);
    stages.forEach(stage => count[stage]++)
    
    return count
        .slice(1)
        .reverse()
        .reduce((arr, cur, idx) => idx? [...arr, cur+arr[idx-1]] : [cur], [])
        .reverse()
        .map((cur, idx, arr) => idx!==N && {idx, rate:arr[idx+1]/cur})
        .filter(n => n!==false)
        .sort((a, b) => a.rate - b.rate).map(({idx}) => idx+1);
}