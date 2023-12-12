function solution(arr) {
    var min = [...arr].sort((a,b) => a-b)[0];
    var newArr = arr.filter(n => n !== min);
    return newArr.length ? newArr : [-1]
}