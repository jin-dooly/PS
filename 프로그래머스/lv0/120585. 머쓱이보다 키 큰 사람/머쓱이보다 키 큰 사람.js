function solution(array, height) {
    array.push(height);
    array.sort((a,b)=> b-a);
    return array.indexOf(height);
}