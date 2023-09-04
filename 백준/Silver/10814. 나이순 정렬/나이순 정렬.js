let [n, ...data] = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n");
data = data.map((e) => e.split(" ")).map(([age, name]) => [Number(age), name.trim()]);
// console.log(data);

//병합 정렬
function mergeSort(arr) {
  if (arr.length < 2) return arr;

  // console.log(arr.slice(0, arr.length / 2));
  // console.log(arr.slice(arr.length / 2));
  var arr1 = mergeSort(arr.slice(0, arr.length / 2));
  var arr2 = mergeSort(arr.slice(arr.length / 2));

  var p1 = 0;
  var p2 = 0;
  var new_arr = [];

  while(p1 < arr1.length && p2 < arr2.length) {
    if (arr1[p1][0] <= arr2[p2][0]) {
      new_arr.push(arr1[p1++]);
    } else {
      new_arr.push(arr2[p2++]);
    }
  }

  if(p1 < arr1.length) {
    new_arr.push(...arr1.slice(p1));
  }
  else if(p2 < arr2.length) {
    new_arr.push(...arr2.slice(p2));
  }

  return new_arr;
}
let sortData = mergeSort(data);

sortData = sortData.map((e) => e.join(" "));

console.log(sortData.join("\n"));
