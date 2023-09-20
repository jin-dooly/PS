const [N, ...paper] = require('fs').readFileSync('dev/stdin').toString().trim().split('\n').map(e => e.trim().split(' ').map(Number));

let count = [0, 0];

function cut(len, row, col) {
  var elem = paper[row][col];
  // console.log(len, row, col, elem);
  if(len === 1){
    count[elem]++;
    return;
  }

  for(var i=row; i<row+len; i++) {
    for(var j=col; j<col+len; j++) {
      if(elem !== paper[i][j]) {
        var nextLen = len/2;
        cut(nextLen, row, col);
        cut(nextLen, row + nextLen, col);
        cut(nextLen, row, col + nextLen);
        cut(nextLen, row + nextLen, col + nextLen);
        return;
      }
    }
  }
  count[elem]++;
}
cut(N[0], 0, 0);

console.log(count.join('\n'));