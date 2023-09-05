let [N, ...arr] = require("fs").readFileSync("dev/stdin").toString().split("\n");
arr = arr.map(row => row.trim().split(" "));

let answer = [0,0,0];

function DivideAndConquer(row, col, len) {
  var firstNumber = Number(arr[row][col]);
  //console.log(row, col, len, firstNumber);
  if(len === 1) {
    answer[firstNumber+1]++;
    return;
  }

  for(var i=row; i<len+row; i++) {
    for(var j=col; j<len+col; j++) {
      if(firstNumber != arr[i][j]) {
        //console.log("!!!", i, j, arr[i][j]);
        var newLen = len/3;
        for(var k=0; k<3; k++){
          for(var l=0; l<3; l++){
            DivideAndConquer(row+newLen*k, col+newLen*l, newLen);
          }
        }
        return;
      }
    }
  }
  answer[firstNumber+1]++;
  //console.log("plus 1 ", firstNumber)
}

DivideAndConquer(0, 0, Number(N));
console.log(answer.join("\n"));