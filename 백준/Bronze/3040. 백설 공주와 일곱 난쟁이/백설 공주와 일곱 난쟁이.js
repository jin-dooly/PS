let dwarf = require('fs').readFileSync("dev/stdin").toString().trim().split("\n").map(Number);
// console.log(cards);

let sum = dwarf.reduce((acc, cur) => acc+=cur)
let rest = sum - 100;

function findDuffer() { //duffer = 가짜, 바보, 사기꾼!
  for(var i=0; i<8; i++){
    for(var j=i+1; j<9; j++){
      if(dwarf[i] + dwarf[j] === rest){
        dwarf[i] = false;
        dwarf[j] = false;
        return; //가짜를 찾을 시 바로 반복문을 끝내기 위해 함수로 작성
      }
    }
  }
}

findDuffer();
console.log(dwarf.filter(e => e).join("\n"));