let [ N,...input ] = require("fs").readFileSync("/dev/stdin").toString().trim().split("\n").map(v => v.split(" "));

var queue = [];
let answer = [];

for(var i=0; i<N; i++){
  var order = input[i];
  if(order[0].includes('push')){
    queue.push(order[1]);
  }
  else if(order[0].includes('pop')){
    answer.push(queue.shift() || -1);
  }
  else if(order[0].includes('size')){
    answer.push(queue.length);
  }
  else if(order[0].includes('empty')){
    answer.push(queue.length? 0 : 1);
  }
  else if(order[0].includes('front')){
    answer.push(queue[0] || -1);
  }
  else if(order[0].includes('back')){
    answer.push(queue[queue.length-1] ||-1);
  }
}
console.log(answer.join("\n"));