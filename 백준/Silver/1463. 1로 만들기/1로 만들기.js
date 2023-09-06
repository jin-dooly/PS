let N = Number(require('fs').readFileSync("dev/stdin").toString());
// console.log(N);
const MAX = 1000001;
let memo = new Array(N+1).fill(MAX);

memo[1] = 0;

for(var i=1; i<N; i++) {
  var nowLength = memo[i]+1;
  memo[i+1] = Math.min(memo[i+1], nowLength);
  if(i*2 <= N) memo[i*2] = Math.min(memo[i*2], nowLength);
  if(i*3 <= N) memo[i*3] = Math.min(memo[i*3], nowLength);
}

console.log(memo[N]);
