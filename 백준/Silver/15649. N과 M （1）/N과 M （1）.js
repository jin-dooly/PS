let [N, M] = require('fs').readFileSync("dev/stdin").toString().trim().split(" ").map(Number);
// console.log(N, M);

let answer = [];
let check = new Array(N+1).fill(false);

function dfs(collection, len) {
  if(len===M) {
    answer.push(collection.join(' '));
    return;
  }

  for(var i=1; i<=N; i++){
    if(!check[i]) {
      check[i] = true;
      dfs([...collection, i], len+1);
      check[i] = false;
    }
  }
}

dfs([], 0);
console.log(answer.join('\n'));