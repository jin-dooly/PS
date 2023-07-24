function solution(arr) {
    var start = arr.indexOf(2);
    var end = arr.lastIndexOf(2);
    return start == -1 ? [-1] : arr.slice(start, end+1);
}