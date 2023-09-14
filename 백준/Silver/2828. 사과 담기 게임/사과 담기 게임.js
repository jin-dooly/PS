let [NM, J, ...drop] = require('fs').readFileSync("dev/stdin").toString().trim().split("\n");
const [N, M] = NM.split(" ").map(Number);
J = Number(J);
drop = drop.map(e => e.trim()).map(Number);


let basket = {
  first : 1,
  last : M,
}

let answer = 0;

drop.forEach(n => {
  let diff = 0;
  if(n < basket.first) {
    diff = basket.first - n;
    basket.first -= diff;
    basket.last -= diff;
  }
  else if(n > basket.last) {
    diff = n - basket.last;
    basket.first += diff;
    basket.last += diff;
  }
  answer += diff;
})
console.log(answer);