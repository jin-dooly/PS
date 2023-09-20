const [N, M] = require('fs').readFileSync('dev/stdin').toString().trim().split('\n').map(Number);
// console.log(N, M);

let map = [];
for(var i=0; i<N; i++) {
  map.push(new Array(N).fill(0));
}

let mPosition = [0, 0];

//재귀
let [row, col, dir] = [0, 0, 'S'];

for(var n=N*N; n>0; n--) {
  if(n === M) mPosition = [row+1, col+1];
  map[row][col] = n;
  if(dir === 'N') {
    if(row-1 < 0 || map[row-1][col] !== 0) [row, col, dir] = [row, col-1, 'W'];
    else row = row-1;
  }
  else if(dir === 'S') {
    if(row+1 >= N || map[row+1][col] !== 0) [row, col, dir] = [row, col+1, 'E'];
    else row = row+1;
  }
  else if(dir === 'E') {
    if(col+1 >= N || map[row][col+1] !== 0) [row, col, dir] = [row-1, col, 'N'];
    else col = col+1;
  }
  else if(dir === 'W') {
    if(col-1 < 0 || map[row][col-1] !== 0) [row, col, dir] = [row+1, col, 'S'];
    else col = col-1;
  }
}

console.log(map.map(e => e.join(' ')).join('\n'));
console.log(mPosition.join(' '));