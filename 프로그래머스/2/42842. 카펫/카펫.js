function solution(brown, yellow) {
    let all = brown+yellow;
    for(let row=1; row <= all/row; row++) {
        if(all%row !== 0) continue;
        let col = all/row;
        if((row-2) * (col-2) === yellow) {
            return [col, row];
        }
    }
    return [];
}