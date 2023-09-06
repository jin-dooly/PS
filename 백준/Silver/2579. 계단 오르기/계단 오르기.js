let [N, ...arr] = require('fs').readFileSync("dev/stdin").toString().trim().split("\n").map(Number);
// console.log(N);
if(arr.length < 2) console.log(arr[0]);
else {
let memo = [arr[0]];

function dp(n) {
  if(n<0) return 0
  if(!memo[n]) memo[n] =  Math.max(dp(n-2), dp(n-3)+arr[n-1]) + arr[n];
  return memo[n];
}

dp(N-1)
console.log(memo[N-1]);
}