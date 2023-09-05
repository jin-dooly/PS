let [len, A, B] = require("fs").readFileSync("dev/stdin").toString().trim().split("\n");
A = A.split(" ").map(Number);
B = B.split(" ").map(Number);
let [N, M] = len.split(" ").map(Number);

let p1 = 0;
let p2 = 0;
let answer = []

while (p1 < N && p2 < M) {
  if(A[p1] < B[p2]) answer.push(A[p1++]);
  else answer.push(B[p2++])
}

if(p1 < N) answer = [...answer, ...A.slice(p1)];
if(p2 < M) answer = [...answer, ...B.slice(p2)];

console.log(answer.join(" "));