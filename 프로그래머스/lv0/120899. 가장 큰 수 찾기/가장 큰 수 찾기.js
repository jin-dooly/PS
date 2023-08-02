function solution(array) {
    var max = [...array].sort((a,b) => b-a)[0];
    var idx = array.indexOf(max);
    return [max, idx];
}