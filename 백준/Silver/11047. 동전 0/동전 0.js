let [NK, ...coin] = require('fs').readFileSync("dev/stdin").toString().trim().split("\n");
let [N, K] = NK.split(" ").map(Number);
coin = coin.map(Number).sort((a, b) => b-a);

const answer = coin.reduce((acc, cur) => {
  if(cur > K || K === 0) return acc;
  var count = Math.floor(K/cur);
  K %= cur;
  return acc + count;
}, 0)

console.log(answer)