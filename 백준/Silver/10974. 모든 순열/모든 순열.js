const fs = require("fs");
let n = Number(fs.readFileSync("/dev/stdin").toString().trim());

let temp = [];
let answer = [];
let visited = new Array(n + 1).fill(0);

function dfs(len) {
  if (len == n) {
    answer.push(temp.join(" "));
    return;
  }

  for (let i = 1; i <= n; i++) {
    if (!visited[i]) {
      visited[i] = 1;
      temp.push(i);
      dfs(len + 1);
      temp.pop();
      visited[i] = 0;
    }
  }
}

dfs(0);
console.log(answer.join("\n"));
