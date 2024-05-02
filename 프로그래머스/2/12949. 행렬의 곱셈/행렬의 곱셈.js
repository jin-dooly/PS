function solution(arr1, arr2) {
    var answer = [];
    arr1.forEach((row, r_idx) => {
        answer.push([])
        for(let i=0; i<arr2[0].length; i++) {
            let sum = 0;
            row.forEach((n, c_idx) => {
                sum += n * arr2[c_idx][i];
            })
            answer[r_idx].push(sum)
        }
        
    })
    return answer;
}