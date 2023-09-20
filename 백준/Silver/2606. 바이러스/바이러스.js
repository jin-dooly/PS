const input = require('fs').readFileSync('dev/stdin').toString().trim().split('\n');

const N = Number(input.shift());
const M = Number(input.shift());
const data = input.map((row) => row.trim().split(' ').map(Number));

let linkedList = new Array(N+1).fill([]);

data.forEach(([a, b]) => {
  linkedList[a].length ? linkedList[a].push(b) : linkedList[a] = [b];
  linkedList[b].length ? linkedList[b].push(a) : linkedList[b] = [a];
})




//BFS
let virus = new Array(N+1).fill(false);

let count = 0;
let queue = [1];
virus[1] = true;
while(queue.length) {
  const len = queue.length;
  for(var i=0; i<len; i++){
    var link = queue.shift();
    linkedList[link].forEach(n => {
      if(!virus[n]){
        virus[n] = true;
        queue.push(n);
      }
    })
    // console.log(link, queue);
    count++;
  }
}


console.log(count-1);