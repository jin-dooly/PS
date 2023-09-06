let [T, ...testCase] = require('fs').readFileSync("dev/stdin").toString().trim().split("\n").map(Number);
// console.log(N);
let memo = [1, 2, 4];

testCase.forEach( N => {
for(var i=3; i<N; i++){
  memo[i] = memo[i-3] + memo[i-2] + memo[i-1];
}

console.log(memo[N-1]);
})