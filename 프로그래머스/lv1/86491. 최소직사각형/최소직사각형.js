function solution(sizes) {
    var answer = 0;
    var maxRow = 0;
    var maxCol = 0;
    sizes.forEach(([w, h]) => {
        col = Math.min(w, h);
        row = Math.max(w, h);
        maxRow = Math.max(maxRow, row);
        maxCol = Math.max(maxCol, col);
    })
    return maxRow * maxCol;
}