let [[N,M], cards] = require('fs').readFileSync("dev/stdin").toString().trim().split("\n").map(e => e.split(" ").map(Number));
// console.log(cards);

let max = 0;

for(var idx1=0; idx1<N-2; idx1++) {
  var sum = cards[idx1];
  if(sum > M) continue;
  for(var idx2=idx1+1; idx2<N-1; idx2++) {
    sum = cards[idx1] + cards[idx2];
    if(sum > M) continue;
    for(var idx3=idx2+1; idx3<N; idx3++) {
      // console.log(`${cards[idx1]} + ${cards[idx2]} + ${cards[idx3]} = ${sum}`);
      if(sum+cards[idx3] <= M) max = Math.max(max, sum+cards[idx3]);
    }
  }
}

console.log(max);