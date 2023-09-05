let [N, cards, M, numbers] = require("fs").readFileSync("dev/stdin").toString().trim().split("\n");
cards = cards.split(" ").map(Number);
numbers = numbers.split(" ").map(Number);


cards.sort((a,b) => a-b);
// console.log(cards);

//분할 정복 -> 이분 탐색
function binarySearch(target, start, end) {
  var middle = start + Math.floor((end-start)/2)
  // console.log("-----"+start+", "+end);

  if(start >= end || cards[middle] === target) return cards[middle]
  if(cards[middle] < target) return binarySearch(target, middle+1, end)
  if(cards[middle] > target) return binarySearch(target, start, middle-1);
}

let answer = [];
numbers.forEach(num => {
  var searchValue = binarySearch(num, 0, cards.length-1);
  if(searchValue === num) answer.push(1)
  else answer.push(0)
})

console.log(answer.join(" "));