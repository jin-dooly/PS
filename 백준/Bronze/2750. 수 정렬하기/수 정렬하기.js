let [n, ...data] = require('fs').readFileSync("/dev/stdin").toString().trim().split('\n').map(Number);
//console.log(n, data);

//선택 정렬
data.forEach((num, idx) => {
  var min = num;
  var minIdx = idx;
  for(var i=idx; i<n; i++){
    if(min > data[i]) {
      min = data[i]
      minIdx = i;
    }
  }
  data[idx] = min;
  data[minIdx] = num;
})

console.log(data.join("\n"));