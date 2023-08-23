let [ N, K ] = require("fs").readFileSync("dev/stdin").toString().trim().split(" ").map(Number);

let Ndan = [];
for(var i=2; i<=K; i++){
  Ndan.push(i*N+"");
}
Ndan = Ndan.filter(e => e.length>1).map(e => Number([...e].reverse().join(""))).sort((a, b) => b-a);

console.log(Ndan[0]);