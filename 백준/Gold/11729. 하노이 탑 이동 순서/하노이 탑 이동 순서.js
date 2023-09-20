const N = Number(require('fs').readFileSync('dev/stdin').toString().trim());

let count = 0;
let answer = [];

function hanoi(n, from, rest, to) {
  if(n === 0) return 
  hanoi(n-1, from, to, rest);
  count++;
  answer.push([from, to]);
  hanoi(n-1, rest, from, to);
}

hanoi(N, 1, 2, 3)

console.log(count);
console.log(answer.map(e => e.join(' ')).join('\n'));