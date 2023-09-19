let [N, ...data] = require('fs').readFileSync("/dev/stdin").toString().trim().split("\n").map(e => e.trim());
data = data.sort((a, b) => {
  if(a.length !== b.length) return a.length - b.length;
  aSum = [...a].reduce((sum, n) => sum += (Number(n) || 0), 0);
  bSum = [...b].reduce((sum, n) => sum += (Number(n) || 0), 0);
  if(aSum !== bSum) return aSum - bSum;
  return a < b ? -1 : 1;
})
console.log(data.join('\n'));